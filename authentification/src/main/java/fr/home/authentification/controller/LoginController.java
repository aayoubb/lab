package fr.home.authentification.controller;

import fr.home.authentification.entities.user.User;
import fr.home.authentification.forms.UserForm;
import fr.home.authentification.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public @ResponseBody ResponseEntity<List<User>> login(@RequestBody UserForm userForm ){
         return new ResponseEntity<List<User>>(userService.getUser(userForm.getLogin(), userForm.getPassword())  //
                , HttpStatus.OK);
    }
}
