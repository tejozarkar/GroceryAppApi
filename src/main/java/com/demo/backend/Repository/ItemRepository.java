package com.demo.backend.Repository;

import com.demo.backend.Model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {

    @Query("SELECT i from Item i where LOWER(i.name) like %:search%")
    Page<Item> findAll(String search, Pageable pageable);
}
