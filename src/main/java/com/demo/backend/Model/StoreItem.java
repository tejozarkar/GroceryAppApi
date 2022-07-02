package com.demo.backend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreItem {

    @EmbeddedId
    StoreItemKey id;

    @ManyToOne
    @MapsId("storeId")
    @JoinColumn(name = "store_id")
    Store store;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    Item item;

    int availableQuantityWithinStore;
}