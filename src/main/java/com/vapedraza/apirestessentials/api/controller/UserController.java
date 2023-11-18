package com.vapedraza.apirestessentials.api.controller;

import com.vapedraza.apirestessentials.api.data.model.UserModel;
import com.vapedraza.apirestessentials.api.service.UserService;
import com.vapedraza.apirestessentials.essential.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    @Qualifier("user_service")
    protected UserService service;

    @GetMapping("all")
    public RestResponse<UserModel> findAll()
    {
        return new RestResponse<UserModel>().buildList(this.service.findAll());
    }

}
