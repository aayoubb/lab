package fr.home.authentification.forms;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserForm {
    /**
     * login
     */
    private String login;

    /**
     * password
     */
    private String password;
}
