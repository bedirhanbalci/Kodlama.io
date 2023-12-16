package eCommerceSystem.dataAccess.concretes;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

import java.util.List;

public class InMemoryUser implements UserDao {
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " added to system");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " updated in the system");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted from the system");
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public String getUserByEmail(User user) {
        return user.getEmail();
    }

    @Override
    public String userPassword(User user) {
        return user.getPassword();
    }
}
