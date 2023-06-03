package model.service;

import model.entity.TV;

public interface TVServiceIXWrite {
    public void save(TV tv);

    public void delete(Long id);

    public void update(TV tvToUpdate);
}
