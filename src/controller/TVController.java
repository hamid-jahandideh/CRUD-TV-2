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

    public List<TV> findAll(){
        List<TV> all = tvServiceIXRead.findAll();
        return all;
    }

}
