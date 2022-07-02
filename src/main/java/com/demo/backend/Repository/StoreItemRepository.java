package com.demo.backend.Repository;

import com.demo.backend.Model.StoreItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreItemRepository extends JpaRepository<StoreItem, Long> {

}
