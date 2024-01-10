package com.obat.obat.service;

import com.obat.obat.entity.Obat;
import com.obat.obat.repository.ObatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObatService {
    @Autowired
    private ObatRepo ORepo;

    public void save(Obat b) {
        ORepo.save(b);
    }

    public List<Obat> getAllObat(){
        return ORepo.findAll();
    }

    public Obat getObatById(int id) {
        return ORepo.findById(id).get();
    }

    public void deleteById(int id) {
        ORepo.deleteById(id);
    }
}
