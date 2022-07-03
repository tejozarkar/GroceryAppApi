package com.demo.backend.Repository;

import com.demo.backend.Model.StoreItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface StoreItemRepository extends JpaRepository<StoreItem, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE StoreItem b set" +
            " b.availableQuantityWithinStore = b.availableQuantityWithinStore - 1 " +
            " where b.store.id = :storeId and " +
            " b.item.id = :itemId ")
    public Integer removeFromInventory(long storeId, long itemId);
}
