package com.demo.backend.Service;

import com.demo.backend.Model.Item;
import com.demo.backend.Model.ItemsResponse;
import com.demo.backend.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Optional;

@Service
public class ItemService {
    static final int DEFAULT_PAGE = 1;
    static final int DEFAULT_PAGE_SIZE = 10;
    static final String DEFAULT_SEARCH = "";
    @Autowired
    ItemRepository itemRepository;

    public ItemsResponse findAllItems(Integer page, Integer size, String search){
        if(page==null){
            page = ItemService.DEFAULT_PAGE;
        }
        if(size == null){
            size = ItemService.DEFAULT_PAGE_SIZE;
        }
        if(search == null){
            search = ItemService.DEFAULT_SEARCH;
        }
        Pageable paging = PageRequest.of(page -1, size);
        Page<Item> pagedResult = itemRepository.findAll(search.toLowerCase(Locale.ROOT), paging);

        return new ItemsResponse(pagedResult.getTotalPages(), page, size, pagedResult.toList());
    }

    public Optional<Item> findById(Long id){
        return itemRepository.findById(id);
    }


}
