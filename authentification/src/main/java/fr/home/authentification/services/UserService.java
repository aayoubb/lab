package fr.home.authentification.services;

import fr.home.authentification.entities.user.User;

import java.util.List;

/**
 * User service.
 */
public interface UserService {

    /**
     *  get user
     * @param login login
     * @param password password
     * @return User
     */
     List<User> getUser(String login, String password);
}
