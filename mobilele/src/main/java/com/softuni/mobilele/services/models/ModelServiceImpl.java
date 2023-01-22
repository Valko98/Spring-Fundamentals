package com.softuni.mobilele.services.models;

import com.softuni.mobilele.repositories.ModelRepository;
import com.softuni.mobilele.services.init.DataBaseInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService, DataBaseInit {
    private final ModelRepository modelRepository;

    @Autowired
    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.modelRepository.count() > 0;
    }
}
