package fr.home.authentification.entities.user;


import fr.home.authentification.entities.userDetail.UserDetail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    private Integer id;
    private String login;
    private String password;
    private String name;
    private String address;
    private Boolean active;
}
