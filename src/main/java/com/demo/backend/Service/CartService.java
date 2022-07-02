package com.demo.backend.Service;

import com.demo.backend.Model.*;
import com.demo.backend.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    StoreService storeService;

    @Autowired
    UserService userService;

    @Autowired
    ItemService itemService;

    public Cart addToCart(CartRequest cartRequest){
        Optional<Item> item = itemService.findById(cartRequest.getItemId());
        if(item.isPresent()){
            User user = userService.getCurrentUser();
            Store store = storeService.findClosestStore(10, user.getLatitude(), user.getLongitude(), item.get().getId()).get(0);
            Cart cart  =  new Cart(user,item.get(), store);
            System.out.println("*************"+cart.getItem().getId());
            return cartRepository.save(cart);
        }else{
            return null;
        }
    }

    public List<CartItem> getCartItems(){
        User user = userService.getCurrentUser();
        return cartRepository.getUserCartItems(user.getId());
    }
}
