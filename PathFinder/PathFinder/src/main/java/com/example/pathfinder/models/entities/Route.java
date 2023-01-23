package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.Level;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "routes")
public class Route extends BaseEntity {

    @Column(columnDefinition = "LONGTEXT",name = "gpx_coordinates")
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Column
    private String name;

    @ManyToOne
    private User author;

    @Column
    private String videoUrl;

    @OneToMany(targetEntity = Comment.class,mappedBy = "route")
    private Set<Comment> comments;

    @OneToOne
    private Picture header;

    @ManyToMany
    private Set<Category> categories;
}
