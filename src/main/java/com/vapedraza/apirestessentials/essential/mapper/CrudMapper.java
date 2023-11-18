package com.vapedraza.apirestessentials.essential.mapper;

import java.util.List;

public interface CrudMapper<T, D> {

    public D toDto(T entity);
    public T toEntity(D dto);
    public List<D> toDtoList(List<T> entityList);
}
