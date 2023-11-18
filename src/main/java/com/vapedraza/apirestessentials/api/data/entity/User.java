package com.vapedraza.apirestessentials.api.data.entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Table(name="users")
@Entity
public class User implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uuid;

    public User() {}
    public User(String uuid) {
        super();
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
