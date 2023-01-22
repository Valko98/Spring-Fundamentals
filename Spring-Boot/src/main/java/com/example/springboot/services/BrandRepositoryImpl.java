package com.example.springboot.services;

import com.example.springboot.models.entities.Brand;
import com.example.springboot.repositories.BrandRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class BrandRepositoryImpl implements BrandRepository {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Brand> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Brand> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Brand> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Brand getOne(String s) {
        return null;
    }

    @Override
    public Brand getById(String s) {
        return null;
    }

    @Override
    public Brand getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Brand> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Brand> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Brand> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Brand> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Brand, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Brand> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Brand> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Brand> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Brand> findAll() {
        return null;
    }

    @Override
    public List<Brand> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Brand entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Brand> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Brand> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Brand> findAll(Pageable pageable) {
        return null;
    }
}
