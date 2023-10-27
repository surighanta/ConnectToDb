package com.suresh.ConnecToDb.repository;
import com.suresh.ConnecToDb.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}
