package com.vapedraza.apirestessentials.api.data.repository;

import com.vapedraza.apirestessentials.api.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface UserRepo extends JpaRepository<User, String> {

    public abstract List<User> findAll();
}
