package com.example.demo.controller;

import com.example.demo.entity.Kitchen;
import com.example.demo.repository.KitchenRepository;
import com.example.demo.services.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080/")
public class KitchenController {
    @Autowired
    public KitchenService kitchenService;
    public KitchenRepository kitchenRepository;

    @GetMapping("/createKitchen")
    public Kitchen createKitchenTable() {

            // kitchenService.addKitchenTable();
        return kitchenService.saveKitchen();
    }
    @PostMapping("/kitchenDetails")
        public ResponseEntity<Kitchen> saveKitchenDetails(@RequestBody Kitchen kitchen)
    {
            return new ResponseEntity<Kitchen>(kitchenService.saveKitchenDetails(kitchen), HttpStatus.OK);
    }



}
