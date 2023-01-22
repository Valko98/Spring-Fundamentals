package com.softuni.mobilele.services.roles;

import com.softuni.mobilele.services.init.DataBaseInit;
import com.softuni.mobilele.view.UserRoleViewModel;

import java.util.List;

public interface UserRoleService  extends DataBaseInit {
    List<UserRoleViewModel> getAll();
}
