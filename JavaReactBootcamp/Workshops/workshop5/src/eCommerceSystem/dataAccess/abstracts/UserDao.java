package eCommerceSystem.dataAccess.abstracts;

import eCommerceSystem.entities.concretes.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(User user);

    User getById(int id);

    List<User> getAll();

    String getUserByEmail(User user);

    String userPassword(User user);

}
