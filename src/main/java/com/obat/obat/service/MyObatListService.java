package com.obat.obat.service;

import com.obat.obat.entity.MyObatList;
import com.obat.obat.repository.MyObatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyObatListService {

    @Autowired
    private MyObatRepo myobat;

    public void saveMyObat(MyObatList obat) {
        myobat.save(obat);
    }

    public List<MyObatList> getAllMyObat(){
        return myobat.findAll();
    }

    public void deleteById(int id) {
        myobat.deleteById(id);
    }
}
