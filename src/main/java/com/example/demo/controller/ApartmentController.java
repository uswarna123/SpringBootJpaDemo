package com.example.demo.controller;

import com.example.demo.entity.Apartment;
import com.example.demo.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApartmentController {

    @Autowired
    ApartmentRepository apartmentRepository;

    @GetMapping("/displayApartments")
    public List<Apartment> displayApartments() {
        return apartmentRepository.findAll();
    }

    @PostMapping("/saveApartment")
    public ResponseEntity<Apartment> saveApartment(@RequestBody Apartment apartment) {

        Apartment response = apartmentRepository.save(apartment);
        return ResponseEntity.ok(response);
    }
}
