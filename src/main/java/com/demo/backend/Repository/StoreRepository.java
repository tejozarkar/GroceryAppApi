package com.demo.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.demo.backend.Model.Store;

import java.util.List;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    @Query(value = "SELECT * FROM (SELECT *, cast( ((acos(sin(( ?2 * pi() / 180))*sin(( latitude * pi() / 180)) + cos(( ?2 * pi() /180 ))*cos(( latitude * pi() / 180)) * cos((( ?3 - longitude) * pi()/180)))) * 180/pi()) * 60 * 1.1515 * 1.609344 as bigint) as distance FROM store as s, store_item as si where si.store_id=s.id and si.available_quantity_within_store>1 and si.item_id=?4) myTable WHERE distance <= ?1 order by distance limit 1;", nativeQuery = true)
    public List<Store> findClosestStore(int distance, double latitude, double longitude, long itemId);
}
