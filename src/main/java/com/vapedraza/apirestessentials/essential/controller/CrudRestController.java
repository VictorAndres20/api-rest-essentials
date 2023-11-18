package com.vapedraza.apirestessentials.essential.controller;

import com.vapedraza.apirestessentials.essential.response.RestResponse;
import com.vapedraza.apirestessentials.essential.service.CrudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class CrudRestController<T, ID, D> implements CrudController<ID, D>{

    protected CrudService<T, ID, D> service;

    public CrudRestController(CrudService<T, ID, D> service){
        this.service = service;
    }

    @Override
    @GetMapping("all")
    public RestResponse<D> findAll() {
        try {
            return new RestResponse<D>().buildList(this.service.findAll());
        } catch (Exception e){
            return new RestResponse<D>().buildError(e.getMessage());
        }

    }

    @Override
    @GetMapping("id/{id}")
    public RestResponse<D> findById(@PathVariable(value="id") ID id) {
        try {
            return new RestResponse<D>().buildData(this.service.findById(id));
        } catch (Exception e){
            return new RestResponse<D>().buildError(e.getMessage());
        }

    }
}
