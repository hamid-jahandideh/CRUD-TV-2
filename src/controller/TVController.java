package controller;

import model.entity.TV;
import model.service.TVService;
import model.service.TVServiceIXRead;
import model.service.TVServiceIXWrite;

import java.util.List;

public class TVController {
    private TVServiceIXWrite tvServiceIXWrite = new TVService();
    private TVServiceIXRead tvServiceIXRead = new TVService();

    public void save(TV tv){
        tvServiceIXWrite.save(tv);
    }

    public void delete(Long id) {
        tvServiceIXWrite.delete(id);
    }

    public void update(TV tvToUpdate) {
        tvServiceIXWrite.update(tvToUpdate);
    }

    public List<TV> findAll(){
        List<TV> all = tvServiceIXRead.findAll();
        return all;
    }

    public TV findById(Long id) {
        TV tv = tvServiceIXRead.findById(id);
        return tv;
    }
}
