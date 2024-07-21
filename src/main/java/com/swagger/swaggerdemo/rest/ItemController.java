package com.swagger.swaggerdemo.rest;

import com.swagger.swaggerdemo.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @GetMapping("/items")
    public List<Item> getItems() {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(1,"mobile",100003));
        return list;
    }

    @PostMapping("/items")
    public Item createItem(@RequestBody Item item) {
        return new Item(1,"mobile", 34655);
    }
}