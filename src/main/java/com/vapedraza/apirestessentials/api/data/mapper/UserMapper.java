package com.vapedraza.apirestessentials.api.data.mapper;

import com.vapedraza.apirestessentials.api.data.entity.User;
import com.vapedraza.apirestessentials.api.data.model.UserModel;
import com.vapedraza.apirestessentials.essential.mapper.DtoMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component("user_mapper")
public class UserMapper extends DtoMapper<User, UserModel> {

    @Override
    public UserModel toDto(User entity) {
        return new UserModel(entity);
    }

    @Override
    public User toEntity(UserModel dto) {
        User entity = new User();
        entity.setUuid(dto.getUuid());
        entity.setUuid(dto.getUuid());
        return entity;
    }
}
