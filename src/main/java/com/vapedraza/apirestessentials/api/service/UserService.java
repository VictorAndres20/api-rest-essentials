package com.vapedraza.apirestessentials.api.service;

import com.vapedraza.apirestessentials.api.data.entity.User;
import com.vapedraza.apirestessentials.api.data.mapper.UserMapper;
import com.vapedraza.apirestessentials.api.data.model.UserModel;
import com.vapedraza.apirestessentials.api.data.repository.UserRepo;
import com.vapedraza.apirestessentials.essential.service.CrudService;
import com.vapedraza.apirestessentials.essential.service.CrudValidationException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service()
public class UserService extends CrudService<User, String, UserModel> {

    @Autowired()
    public UserService(UserRepo repo, UserMapper mapper){
        super(repo, mapper);
    }


    @Override
    public void validateCreation(User entity) throws CrudValidationException {
        // TODO implements
    }

    @Override
    public User buildBaseCreation(UserModel dto) {
        return super.mapper.toEntity(dto);
    }

    @Override
    public void validateUpload(User entity) throws CrudValidationException {
        // TODO implements
    }

    @Override
    public User buildBaseUpload(UserModel dto) {
        User entity = new User();
        entity.setUuid(Strings.isBlank(dto.getUuid()) ? dto.getUuid() : entity.getUuid());
        return entity;
    }
}
