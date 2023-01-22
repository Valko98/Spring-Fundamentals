package example.springbootmobilele.model.entity;

import example.springbootmobilele.model.enums.CategoryEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private CategoryEnum category;

    private String imageUrl;

    private int startYear;

    private Long endYear;

}
