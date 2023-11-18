package com.vapedraza.apirestessentials.api.data.model;

import com.vapedraza.apirestessentials.api.data.entity.User;

public class UserModel {

    private String uuid;

    public UserModel(){}

    public UserModel(User user){
        this.uuid = user.getUuid();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
