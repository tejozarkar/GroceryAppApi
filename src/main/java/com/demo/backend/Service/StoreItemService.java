package com.demo.backend.Service;

import com.demo.backend.Model.Item;
import com.demo.backend.Model.Store;
import com.demo.backend.Model.StoreItem;
import com.demo.backend.Model.StoreItemKey;
import com.demo.backend.Repository.StoreItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreItemService {

    @Autowired
    StoreService storeService;

    @Autowired
    ItemService itemService;

    @Autowired
    StoreItemRepository storeItemRepository;

    public Integer removeFromInventory(long storeId, long itemId){
        return storeItemRepository.removeFromInventory(storeId, itemId);
    }


//    public void dump(){
//        List<Store> stores = storeService.findAllStores();
//        List<Item> items = itemService.findAllItems(null, null);
//        stores.forEach(store->{
//            items.forEach(item->{
//                StoreItem storeItem = new StoreItem();
//                storeItem.setId(new StoreItemKey(store.getId(), item.getId()));
//                storeItem.setStore(store);
//                storeItem.setItem(item);
//                storeItem.setAvailableQuantityWithinStore(item.getAvailableQuantity());
//                storeItemRepository.save(storeItem);
//            });
//        });
//    }
}
