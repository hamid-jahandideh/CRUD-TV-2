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
    public void delete(Long id) {
        TV foundInDB = findById(id);
        tvList.remove(foundInDB);
    }

    @Override
    public void update(TV tvToUpdate) {
        for (TV tvInDB : tvList) {
            if (tvInDB.getId() == tvToUpdate.getId()) {
                tvInDB.setTvMark(tvToUpdate.getTvMark());
                tvInDB.setTvModel(tvToUpdate.getTvModel());
                tvInDB.setTvWidth(tvToUpdate.getTvWidth());
                tvInDB.setTvHeight(tvToUpdate.getTvHeight());
                break;
            }
        }
    }


    @Override
    public List<TV> findAll() {
        return tvList;
    }

    @Override
    public TV findById(Long id) {
        TV tvFoundInList = null;
        for (TV tv : tvList) {
            if (tv.getId() == id) {
                tvFoundInList = tv;
                break;
            }
        }
        return tvFoundInList;
    }
}
