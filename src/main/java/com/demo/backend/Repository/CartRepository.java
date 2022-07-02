package com.demo.backend.Repository;

import com.demo.backend.Model.Cart;
import com.demo.backend.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    @Query("SELECT new com.demo.backend.Model.CartItem(i,s) from Item i, Store s, Cart c where c.user.id=:userId and c.item.id=i.id and s.id=c.store.id")
    public List<CartItem> getUserCartItems(long userId);
}
