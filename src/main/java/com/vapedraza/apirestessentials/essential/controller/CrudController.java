package com.vapedraza.apirestessentials.essential.controller;

import com.vapedraza.apirestessentials.essential.response.RestResponse;

public interface CrudController<ID, D> {

    public RestResponse<D> findAll();

    public RestResponse<D> findById(ID id);

}
