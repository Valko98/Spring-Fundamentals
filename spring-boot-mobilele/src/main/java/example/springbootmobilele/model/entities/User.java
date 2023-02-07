package example.springbootmobilele.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "is_active")
    private boolean isActive;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<UserRole> userRoles = new ArrayList<>();
    public User addRole(UserRole userRole) {
        this.userRoles.add(userRole);
        return this;
    }

}
