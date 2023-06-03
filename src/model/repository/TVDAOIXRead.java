package model.repository;

import model.entity.TV;

import java.util.List;

public interface TVDAOIXRead {
    public List<TV> findAll();

    public TV findById(Long id);
}
