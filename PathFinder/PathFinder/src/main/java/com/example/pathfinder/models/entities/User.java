package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.Level;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true)
    private String email;

    @Column(name = "full_name")
    private String fullName;

    @Column
    private int age;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    @Enumerated(EnumType.STRING)
    private Level level;

    public User(String username, String password, String email, String fullName, int age) {
         this();
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.age = age;

    }

    public User() {
        this.roles = new HashSet<>();
    }
}
