package model.service;

import model.entity.TV;
import model.repository.TVDAO;
import model.repository.TVDAOIXWrite;

public class TVService implements TVServiceIX{
    private TVDAOIXWrite tvdaoix = new TVDAO();
    @Override
    public void save(TV tv) {
        tvdaoix.save(tv);
    }
}
