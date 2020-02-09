package fr.home.authentification.services;

import fr.home.authentification.entities.user.User;

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
     User getUser(String login, String password);
}
