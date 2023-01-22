package com.softuni.mobilele.models.entities;

import com.softuni.mobilele.models.enums.ModelCategory;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    @Column(nullable = false,unique = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategory category;

    @Column
    private String imageUrl;

    @Column
    private Integer startYear;

    @Column
    private Integer endYear;

    @Column
    private Date created;

    @Column
    private Date modified;

    @ManyToOne
    private Brand brand;

    public String getName() {
        return name;
    }

    public Date getCreated() {
        return created;
    }

    public ModelCategory getCategory() {
        return category;
    }

    public Date getModified() {
        return modified;
    }

    public Brand getBrand() {
        return brand;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setCategory(ModelCategory category) {
        this.category = category;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
