package com.costinel.workshop_create_insurer_microservice.controller;

import com.costinel.workshop_create_insurer_microservice.model.Insurer;
import com.costinel.workshop_create_insurer_microservice.repo.InsurerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkshopCreateInsurerMicroserviceController {

    @Autowired
    private InsurerRepo insurerRepo;

    @GetMapping(value = "/getInsurers")
    public List<Insurer> getInsurers(){
        return insurerRepo.findAll();
    }

    @GetMapping(value = "/getInsurer/{id}")
    public List<Insurer> getInsurerById(@PathVariable long id){
        return insurerRepo.findById(id).stream().toList();
    }

    @PostMapping(value = "/saveInsurer")
    public long saveInsurer(@RequestBody Insurer insurer){
        long id = insurerRepo.save(insurer).getId();
        System.out.println("Insurer saved successfully!");
        return id;
    }

    @PutMapping(value = "/updateInsurer/{id}")
    public String updateInsurerById(@PathVariable long id, @RequestBody Insurer insurer){
        Insurer insurerToUpdate = insurerRepo.findById(id).get();
        insurerToUpdate.setInsurerName(insurer.getInsurerName());
        insurerToUpdate.setInsurerAddress(insurer.getInsurerAddress());
        insurerToUpdate.setInsurerPostCode(insurer.getInsurerPostCode());
        insurerToUpdate.setInsurerEmailAddress(insurer.getInsurerEmailAddress());
        insurerToUpdate.setInsurerPhoneNumber(insurer.getInsurerPhoneNumber());
        insurerRepo.save(insurerToUpdate);
        return "Insurer updated successfully!";
    }

    @DeleteMapping(value = "/deleteInsurer/{id}")
    public String deleteInsurerById(@PathVariable long id){
        insurerRepo.delete(insurerRepo.findById(id).get());
        return "Insurer deleted successfully!";
    }

}
