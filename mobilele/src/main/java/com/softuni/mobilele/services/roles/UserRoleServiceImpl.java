package com.softuni.mobilele.services.roles;

import com.softuni.mobilele.models.entities.UserRole;
import com.softuni.mobilele.models.enums.Role;
import com.softuni.mobilele.repositories.RoleRepository;
import com.softuni.mobilele.view.UserRoleViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public UserRoleServiceImpl(RoleRepository roleRepository, ModelMapper modelMapper) {
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
        this.dbInit();
    }

    @Override
    public void dbInit() {
        if (!isDbInit()) {

            List<UserRole> roles = new ArrayList<>();

            roles.add(new UserRole().setRole(Role.USER));
            roles.add(new UserRole().setRole(Role.ADMIN));

            this.roleRepository.saveAllAndFlush(roles);
        }
    }


    @Override
    public boolean isDbInit() {
        return this.roleRepository.count() > 0;
    }

    public List<UserRoleViewModel> getAll() {
       return  this.roleRepository.findAll()
                .stream().
                map(r -> this.modelMapper.map(r, UserRoleViewModel.class)).toList();
    }

}
