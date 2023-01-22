package com.example.springboot.repositories;

import com.example.springboot.models.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, String> {
}
