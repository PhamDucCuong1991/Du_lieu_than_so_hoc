package com.demothansohoc.service;

import com.demothansohoc.model.ThanSoHoc;
import com.demothansohoc.repository.ICRUD;
import com.demothansohoc.repository.IThanSoHocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThanSoHocService implements ICRUD<ThanSoHoc> {

    @Autowired
    private IThanSoHocRepo thanSoHocRepo;
    @Override
    public List<ThanSoHoc> findAll() {
        return thanSoHocRepo.findAll();
    }

    @Override
    public ThanSoHoc findOne(Long id) {
        return thanSoHocRepo.findById(id).orElse(null);
    }

    @Override
    public boolean save(ThanSoHoc thanSoHoc) {
        if(thanSoHoc!=null){
            thanSoHocRepo.save(thanSoHoc);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        if(thanSoHocRepo.findById(id).isPresent()){
            thanSoHocRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
