package com.example.demo.services;

import com.example.demo.entity.Kitchen;
import com.example.demo.repository.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitchenServiceImpl implements KitchenService {

    @Autowired
    private KitchenRepository kitchenRepository;
    @Override
    public void addKitchenTable() {

        System.out.println("I am in KitchenServiceImpl");
    }
    public Kitchen saveKitchen()
    {
        Kitchen kitchen = new Kitchen();
        kitchen.setName("Great Kitchen -1");
        kitchen.setLocation("Memphis");


        return kitchenRepository.save(kitchen);

    }

    @Override
    public Kitchen saveKitchenDetails(Kitchen kitchen) {

        Kitchen kitchenDetails = new Kitchen();
        kitchenDetails.setName("Great Kitchen -2");
        kitchenDetails.setLocation("Texas");
        return kitchenRepository.save(kitchenDetails);
    }

}
