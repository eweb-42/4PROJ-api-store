package com.supinfo.proj.retailr.apistore.data.repository;

import com.supinfo.proj.retailr.apistore.data.entity.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item, Long> {
    boolean existsByEpc(String string);
    Optional<Item> findItemByEpc(String string);
}
