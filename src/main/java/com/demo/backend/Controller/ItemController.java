package com.demo.backend.Controller;

import com.demo.backend.Model.Item;
import com.demo.backend.Model.ItemsResponse;
import com.demo.backend.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public ItemsResponse getAllItems(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size,  @RequestParam(required = false) String search){
        return itemService.findAllItems(page, size, search);
    }
}
