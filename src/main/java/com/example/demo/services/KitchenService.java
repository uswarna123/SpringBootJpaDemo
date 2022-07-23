package com.example.demo.services;

import com.example.demo.entity.Kitchen;

public interface KitchenService {

    public void addKitchenTable();
   public Kitchen saveKitchen();

    Kitchen saveKitchenDetails(Kitchen kitchen);
}
