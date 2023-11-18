package com.vapedraza.apirestessentials.essential.mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class DtoMapper<T, D> implements CrudMapper<T, D> {

    @Override
    public List<D> toDtoList(List<T> entityList) {
        return entityList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
