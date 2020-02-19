package fr.home.authentification.entities.userDetail;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class UserDetail implements Serializable {
    @Id
    private Integer id;
    private String location;

}
