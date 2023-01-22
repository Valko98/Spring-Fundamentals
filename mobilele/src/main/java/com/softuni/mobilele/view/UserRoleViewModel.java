package com.softuni.mobilele.view;

import com.softuni.mobilele.models.enums.Role;

public class UserRoleViewModel {
    private Role role;

    public Role getRole() {
        return role;
    }

    public UserRoleViewModel setRole(Role role) {
        this.role = role;
        return this;
    }
}
