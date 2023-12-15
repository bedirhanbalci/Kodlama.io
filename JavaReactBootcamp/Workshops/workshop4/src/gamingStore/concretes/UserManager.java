package gamingStore.concretes;

import gamingStore.abstracts.UserCheckService;
import gamingStore.abstracts.UserService;
import gamingStore.entities.concretes.Gamer;

public class UserManager implements UserService {
    private final UserCheckService userCheckService;

    public UserManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(Gamer gamer) {
        if (userCheckService.checkIfUserReal()) {
            System.out.println(gamer.getFirstName() + " your account created");
        } else {
            System.out.println("Invalid national id");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " your account deleted");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " your account updated");
    }
}
