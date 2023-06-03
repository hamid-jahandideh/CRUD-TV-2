package model.repository;

import model.entity.TV;

public interface TVDAOIXWrite {
    public void save(TV tv);
    public void delete(Long id);

    public void update(TV tvToUpdate);
}
