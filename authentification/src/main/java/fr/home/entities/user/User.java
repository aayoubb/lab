package fr.home.entities.user;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

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
