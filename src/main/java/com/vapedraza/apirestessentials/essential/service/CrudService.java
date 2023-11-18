package com.vapedraza.apirestessentials.essential.service;

import com.vapedraza.apirestessentials.essential.mapper.DtoMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class CrudService<T, ID, D> implements BasicCrud<D, ID>  {

    protected JpaRepository<T, ID> repo;

    protected DtoMapper<T, D> mapper;

    public CrudService(JpaRepository<T, ID> repo, DtoMapper<T, D> mapper){
        this.repo = repo;
        this.mapper = mapper;
    }

    public abstract void validateCreation(T entity) throws CrudValidationException;

    public abstract T buildBaseCreation(D dto);
    public abstract void validateUpload(T entity) throws CrudValidationException;

    public abstract T buildBaseUpload(D dto);

    @Override
    public List<D> findAll() {
        return this.mapper.toDtoList(this.repo.findAll());
    }

    @Override
    public D findById(ID id) {
        Optional<T> maybeEntity = this.repo.findById(id);
        return maybeEntity.map(t -> this.mapper.toDto(t)).orElse(null);
    }

    @Override
    public D create(D dto) throws CrudValidationException {
        T entity = this.buildBaseCreation(dto);
        this.validateCreation(entity);
        T created = this.repo.save(entity);
        return this.mapper.toDto(created);
    }

    @Override
    public D update(D dto) throws CrudValidationException {
        T entity = this.buildBaseUpload(dto);
        this.validateUpload(entity);
        T uploaded = this.repo.save(entity);
        return this.mapper.toDto(uploaded);
    }
}
