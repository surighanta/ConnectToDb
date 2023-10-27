package com.suresh.ConnecToDb.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.suresh.ConnecToDb.model.Inventory;
import com.suresh.ConnecToDb.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping()
    public List<Inventory> getAll() {
        List<Inventory> listItems = inventoryRepository.findAll();

        return listItems;
    }

    @GetMapping("/{id}")
    public Optional<Inventory> getById(@PathVariable("id") long id) {
        Optional<Inventory> item = inventoryRepository.findById(id);

        return item;
    }

    @PostMapping()
    public List<Inventory> addNew(@RequestBody Inventory inv) {
        Inventory _inv = inventoryRepository.save(inv);

        return inventoryRepository.findAll();
    }

    @DeleteMapping()
    public List<Inventory> delete(@PathVariable("id") long id) {
        inventoryRepository.deleteById(id);

        return inventoryRepository.findAll();
    }

}
