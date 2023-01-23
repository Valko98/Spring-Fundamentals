package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.UserRoles;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private UserRoles name;

}
