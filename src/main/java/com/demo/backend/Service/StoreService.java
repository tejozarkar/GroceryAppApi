package com.demo.backend.Service;

import com.demo.backend.Model.Store;
import com.demo.backend.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;


    public List<Store> findAllStores(){
        return storeRepository.findAll();
    }

}
