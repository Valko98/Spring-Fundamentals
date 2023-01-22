package com.example.springboot.models.entities;

import com.example.springboot.models.enums.Engine;
import com.example.springboot.models.enums.Transmission;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private Engine engine;

    @Column
    private String imageUrl;

    @Column
    private Integer mileage;

    @Column
    private Integer price;

    @Enumerated(EnumType.STRING)
    private Transmission transmission;

    @Column
    private Integer year;

    private Date created;

    @Column
    private Date modified;

    @ManyToOne
    private Model model;

    @ManyToOne
    private User seller;

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Engine getEngine() {
        return engine;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Date getModified() {
        return modified;
    }

    public Integer getPrice() {
        return price;
    }

    public Date getCreated() {
        return created;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Model getModel() {
        return model;
    }

    public User getSeller() {
        return seller;
    }

    public Integer getYear() {
        return year;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
