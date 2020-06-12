package com.wsb.item.desc.controller;

import com.wsb.item.desc.common.R;
import com.wsb.item.desc.pojo.ItemDesc;
import com.wsb.item.desc.service.ItemDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item/desc")
public class ItemDescController {
    @Autowired
    private ItemDescService itemDescService;
    @GetMapping("findById/{id}")
    public ItemDesc findById(@PathVariable("id") Long id){
        ItemDesc itemDesc = itemDescService.findById(id);
        return itemDesc;

    }
    @DeleteMapping("delete/{id}")
    public int deleteById(@PathVariable("id") Long id){
        int i = itemDescService.deleteItemDescById(id);
        return i;
    }
    @PostMapping("add")
    public int addItemDesc(@RequestBody ItemDesc itemDesc){
        int i = itemDescService.addItemDesc(itemDesc);
        return i;
    }
    @PutMapping("update")
    public int update(@RequestBody ItemDesc itemDesc){
        int i = itemDescService.updateItemDescById(itemDesc);
        return i;
    }
}
