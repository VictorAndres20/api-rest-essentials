package com.vapedraza.apirestessentials.api.controller;

import com.vapedraza.apirestessentials.api.data.entity.User;
import com.vapedraza.apirestessentials.api.data.model.UserModel;
import com.vapedraza.apirestessentials.api.service.UserService;
import com.vapedraza.apirestessentials.essential.controller.CrudRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController extends CrudRestController<User, String, UserModel> {

    @Autowired
    public UserController(UserService service){
        super(service);
    }

}
