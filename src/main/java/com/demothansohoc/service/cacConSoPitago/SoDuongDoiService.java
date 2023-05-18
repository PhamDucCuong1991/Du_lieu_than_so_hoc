package com.demothansohoc.service.cacConSoPitago;

import com.demothansohoc.model.cacConSoPitago.SoDuongDoi;
import com.demothansohoc.repository.ICRUD;
import com.demothansohoc.repository.cacConSoPitago.SoDuongDoiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoDuongDoiService implements ICRUD<SoDuongDoi> {

    @Autowired
    private SoDuongDoiRepo soDuongDoiRepo;
    @Override
    public List<SoDuongDoi> findAll() {
        return soDuongDoiRepo.findAll();
    }

    @Override
    public SoDuongDoi findOne(Long id) {
        return soDuongDoiRepo.findById(id).orElse(null);
    }

    @Override
    public boolean save(SoDuongDoi soDuongDoi) {
        if(soDuongDoi!=null){
            soDuongDoiRepo.save(soDuongDoi);
            return true;
        }
      return false;
    }

    @Override
    public boolean delete(Long id) {

        if(soDuongDoiRepo.findById(id).isPresent()){
            soDuongDoiRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
