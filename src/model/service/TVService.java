package model.service;

import model.entity.TV;
import model.repository.TVDAO;
import model.repository.TVDAOIXRead;
import model.repository.TVDAOIXWrite;

import java.util.List;

public class TVService implements TVServiceIXWrite, TVServiceIXRead {
    private TVDAOIXWrite tvdaoixWrite = new TVDAO();
    private TVDAOIXRead tvdaoixRead = new TVDAO();
    @Override
    public void save(TV tv) {
        tvdaoixWrite.save(tv);
    }

    @Override
    public void delete(Long id) {
        tvdaoixWrite.delete(id);
    }

    @Override
    public void update(TV tvToUpdate) {
        tvdaoixWrite.update(tvToUpdate);
    }

    @Override
    public List<TV> findAll() {
        List<TV> tvList = tvdaoixRead.findAll();
        return tvList;
    }

    public TV findById(Long id) {
        TV tv = tvdaoixRead.findById(id);
        return tv;
    }
}
