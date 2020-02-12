package fr.home.authentification.services.impl;

import fr.home.authentification.entities.user.User;
import fr.home.authentification.entities.user.UserRepository;
import fr.home.authentification.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser(String login, String password) {
        return userRepository.findAll();
    }
}
