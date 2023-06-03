package model.service;

import model.entity.TV;
import model.repository.TVDAO;
import model.repository.TVDAOIX;

public class TVService implements TVServiceIX{
    private TVDAOIX tvdaoix = new TVDAO();
    @Override
    public void save(TV tv) {
        tvdaoix.save(tv);
    }
}
