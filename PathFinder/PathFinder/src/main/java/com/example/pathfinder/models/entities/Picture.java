package com.example.pathfinder.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pictures")
public class Picture extends BaseEntity {

    @Column
    private String title;

    @Column(nullable = false)
    private String url;

    @ManyToOne
    private User author;

    @OneToOne(targetEntity = Route.class, mappedBy = "header")
    private Route route;

}
