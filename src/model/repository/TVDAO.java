package model.repository;

import model.entity.TV;

import java.util.ArrayList;
import java.util.List;

public class TVDAO implements TVDAOIXWrite {
    private static List<TV> tvList = new ArrayList<>();
    public void save(TV tv){
        tvList.add(tv);
    }



}
