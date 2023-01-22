package com.softuni.mobilele.services.init;

import com.softuni.mobilele.services.roles.UserRoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class DataBaseInitImpl implements DataBaseInit {
        private final UserRoleService roleService;

    public DataBaseInitImpl(UserRoleService roleService) {
        this.roleService = roleService;
    }

    @PostConstruct
    public void postConstruct() {
        dbInit();
    }

    @Override
    public void dbInit() {
        if (isDbInit()) {
            this.roleService.dbInit();
        }
    }

    @Override
    public boolean isDbInit() {
        return this.roleService.isDbInit();
    }
}
