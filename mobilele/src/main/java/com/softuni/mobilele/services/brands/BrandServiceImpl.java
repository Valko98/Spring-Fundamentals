package com.softuni.mobilele.services.brands;

import com.softuni.mobilele.repositories.BrandRepository;
import com.softuni.mobilele.services.init.DataBaseInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService, DataBaseInit {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.brandRepository.count() > 0;
    }
}
