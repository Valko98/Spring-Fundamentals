package example.springbootmobilele.model.entity;

import example.springbootmobilele.model.enums.CategoryEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CategoryEnum category;

    @Column(nullable = false)
    private String imageUrl;


    private int startYear;

    private Long endYear;

    @ManyToOne
    private BrandEntity brand;
}
