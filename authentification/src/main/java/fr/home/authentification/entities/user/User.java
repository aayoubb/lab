package fr.home.authentification.entities.user;


import fr.home.authentification.entities.userDetail.UserDetail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class User implements Serializable {

    @Id
    private Integer id;
    private String login;
    private String password;
    private String name;
    private String address;
    private Boolean active;
    @OneToOne()
    @JoinColumns( {@JoinColumn(name = "userDetailId", referencedColumnName="id",  insertable=false, updatable=false),
            @JoinColumn(name = "address", referencedColumnName="location", insertable=false, updatable=false)} )
    private UserDetail userDetail;

}
