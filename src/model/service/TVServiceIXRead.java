package model.service;

import model.entity.TV;

import java.util.List;

public interface TVServiceIXRead {
    public List<TV> findAll();

    public TV findById(Long id);
}
