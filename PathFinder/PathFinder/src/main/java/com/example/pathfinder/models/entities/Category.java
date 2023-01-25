package com.example.pathfinder.models.entities;

import com.example.pathfinder.models.enums.CategoryName;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CategoryName category;

    @Column(columnDefinition = "TEXT")
    private String description;
}
