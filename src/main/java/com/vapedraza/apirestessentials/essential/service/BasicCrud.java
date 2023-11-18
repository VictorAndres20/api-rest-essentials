package com.vapedraza.apirestessentials.essential.service;

import java.util.List;

public interface BasicCrud<D, ID> {
    public List<D> findAll();
    public D findById(ID id);
    public D create(D dto) throws CrudValidationException;
    public D update(D dto) throws CrudValidationException;

}
