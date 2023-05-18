package com.demothansohoc.service.cacConSoPitago;

import com.demothansohoc.model.cacConSoPitago.SoLinhHon;
import com.demothansohoc.repository.ICRUD;
import com.demothansohoc.repository.cacConSoPitago.SoLinhHonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoLinhHonService implements ICRUD<SoLinhHon> {
    @Autowired
    private SoLinhHonRepo soLinhHonRepo;
    @Override
    public List<SoLinhHon> findAll() {
        return soLinhHonRepo.findAll();
    }

    @Override
    public SoLinhHon findOne(Long id) {
        return soLinhHonRepo.findById(id).orElse(null);
    }

    @Override
    public boolean save(SoLinhHon soLinhHon) {
        if(soLinhHon!=null){
            soLinhHonRepo.save(soLinhHon);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        if(soLinhHonRepo.findById(id).isPresent()){
            soLinhHonRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
