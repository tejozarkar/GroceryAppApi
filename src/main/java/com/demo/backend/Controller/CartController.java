package com.demo.backend.Controller;

import com.demo.backend.Model.Cart;
import com.demo.backend.Model.CartItem;
import com.demo.backend.Model.CartRequest;
import com.demo.backend.Model.Item;
import com.demo.backend.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping
    public Cart addCart(@RequestBody CartRequest cartRequest){
        return cartService.addToCart(cartRequest);
    }

    @GetMapping
    public List<CartItem> getCartItems(){
        return cartService.getCartItems();
    }


}
