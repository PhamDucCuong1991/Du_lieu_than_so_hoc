package com.demothansohoc.controller;

import com.demothansohoc.model.ThanSoHoc;
import com.demothansohoc.service.ThanSoHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class ThanSoHocController {
    @Autowired
    private ThanSoHocService thanSoHocService;

    @GetMapping
    public List<ThanSoHoc> getAll(){
        return thanSoHocService.findAll();
    }

    @PostMapping
    public boolean create(@RequestBody ThanSoHoc thanSoHoc){
        return thanSoHocService.save(thanSoHoc);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable Long id, @RequestBody ThanSoHoc thanSoHoc){
        ThanSoHoc thanSoHoc1 = thanSoHocService.findOne(id);
        if(thanSoHoc1!=null){
            return thanSoHocService.save(thanSoHoc);
        }
       return false;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id){
        return thanSoHocService.delete(id);
    }
}
