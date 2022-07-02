package com.demo.backend.Controller;

import com.demo.backend.Model.Store;
import com.demo.backend.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

//    @GetMapping
//    public List<Store> getClosestStores(){
//        return storeService.findClosestStore();
//    }
}
