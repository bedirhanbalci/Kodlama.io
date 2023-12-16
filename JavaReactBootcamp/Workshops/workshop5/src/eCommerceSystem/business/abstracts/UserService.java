package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

import java.util.List;

public interface UserService {

    void register(User user);

    void registerWithGoogle();

    List<User> getAll();

    void login(User user);
}
