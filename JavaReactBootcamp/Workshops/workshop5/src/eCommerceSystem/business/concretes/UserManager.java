package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.ConfirmationService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.core.GoogleService;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {

    private final UserDao userDao;
    private final ConfirmationService confirmationService;
    private final GoogleService googleService;

    public UserManager(UserDao userDao, ConfirmationService confirmationService, GoogleService googleService) {
        this.userDao = userDao;
        this.confirmationService = confirmationService;
        this.googleService = googleService;
    }


    @Override
    public void register(User user) {
        if (!(checkNameLength(user)) || !(checkLastNameLength(user))) {
            System.out.println("Firstname and lastname length must be at least 2 character!");
            return;
        }

        final String EMAIL_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user.getEmail());

        if (!matcher.matches()) {
            System.out.println("Invalid email format!");
            return;
        }

        this.confirmationService.sendConfirmationEmail();

        if (confirmationService.checkEmailConfirmation()) {
            System.out.println("Your email successfully confirmed!");
            userDao.add(user);
            return;
        } else {
            System.out.println("Your email not confirmed!");
        }
    }

    @Override
    public void registerWithGoogle() {
        if (googleService.registrationTheSystemWithGoogleAccount()) {
            System.out.println("You registered with your google account!");
        } else {
            System.out.println("Invalid google account!");
        }
    }


    @Override
    public List<User> getAll() {
        return null;
    }


    @Override
    public void login(User user) {
        if (checkPassword(user) == true && checkIfEmailExists(user) == true) {
            System.out.println(user.getFirstName() + " you logged to the system successfully");
        } else {
            System.out.println("Your email or password is incorrect");
        }
    }

    private boolean checkNameLength(User user) {
        if (user.getFirstName().length() > 2) {
            return true;
        }
        return false;
    }

    private boolean checkLastNameLength(User user) {
        if (user.getLastName().length() > 2) {
            return true;
        }
        return false;
    }

    private boolean checkPasswordLength(User user) {
        if (user.getPassword().length() > 5) {
            return true;
        }
        return false;
    }

    private boolean checkPassword(User user) {
        if (userDao.userPassword(user).equals("123456")) {
            return true;
        }
        return false;
    }

    private boolean checkIfEmailExists(User user) {
        if (userDao.getUserByEmail(user).equals("deneme@gmail.com")) {
            return true;
        }
        return false;
    }

}
