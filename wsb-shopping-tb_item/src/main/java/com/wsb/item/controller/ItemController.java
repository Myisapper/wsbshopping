package com.wsb.item.controller;

import com.wsb.item.common.R;
import com.wsb.item.pojo.Item;
import com.wsb.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
@CrossOrigin
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("finAll")
    public  List<Item> findAll(){
        List<Item> list = itemService.findAllItem();
        return list;
    }
    @PostMapping("addItem")
    public Long addItem(@RequestBody Item item){

        Long i = itemService.addItem(item);
        return i;
    }
    @DeleteMapping("delete/{id}")
    public int deleteItem(@PathVariable("id") Long id){
        int i = itemService.deleteItemById(id);
        return i;
    }
    @GetMapping("findById/{id}")
    public Item findItemById(@PathVariable("id") Long id){
        Item item = itemService.findItemByid(id);
        return item;
    }
    @PutMapping("updateById")
    public int updateItemById(@RequestBody Item item){
        int i = itemService.updateItemById(item);
        return i;
    }
}
