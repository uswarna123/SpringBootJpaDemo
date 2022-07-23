package com.example.demo.data;

import com.example.demo.entity.Kitchen;
import com.example.demo.repository.KitchenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseTableLoader implements ApplicationRunner {

    @Autowired
    KitchenRepository kitchenRepository;

    public void run(ApplicationArguments args) {
       // addKitchen();
     //   addKitchen1();
    }
    public void addKitchen(){
        System.out.println("I am loading data.. by default");
        Kitchen  kitchen = new Kitchen();
        kitchen.setName("Great Kitchen");
        kitchen.setLocation("Boston");
        kitchenRepository.save(kitchen);

    }

    public void addKitchen1(){
        Kitchen kitchen = new Kitchen();
        kitchen.setName("Great Kitchen -1");
        kitchen.setLocation("NY");
        kitchenRepository.save(kitchen);

    }

}
