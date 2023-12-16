package eCommerceSystem;

import eCommerceSystem.business.concretes.EmailConfirmationManager;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.core.JGoogleManagerAdapter;
import eCommerceSystem.dataAccess.concretes.InMemoryUser;
import eCommerceSystem.entities.concretes.User;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "Bedirhan", "Balci", "deneme@gmail.com", "123456");

        UserManager userManager = new UserManager(new InMemoryUser(), new EmailConfirmationManager(), new JGoogleManagerAdapter());

        userManager.registerWithGoogle();
    }
}