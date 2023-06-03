package controller;

import model.entity.TV;
import model.service.TVService;
import model.service.TVServiceIX;

public class TVController {
    private TVServiceIX tvServiceIX = new TVService();
    public void save(TV tv){
        tvServiceIX.save(tv);
    }
}
