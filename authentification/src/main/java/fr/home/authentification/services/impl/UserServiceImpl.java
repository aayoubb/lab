package fr.home.authentification.services.impl;

import fr.home.authentification.user.User;
import fr.home.authentification.user.UserRepository;
import fr.home.authentification.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }
}
