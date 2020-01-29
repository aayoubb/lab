package fr.home.services;

import fr.home.entities.user.User;

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
    public User getUser(String login, String password);
}
