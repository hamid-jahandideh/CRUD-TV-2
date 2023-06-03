package model.repository;

import model.entity.TV;

import java.util.ArrayList;
import java.util.List;

public class TVDAO implements TVDAOIXWrite, TVDAOIXRead{
    private static List<TV> tvList = new ArrayList<>();
    public void save(TV tv){
        tvList.add(tv);
    }


    @Override
    public List<TV> findAll() {
        return tvList;
    }
}
