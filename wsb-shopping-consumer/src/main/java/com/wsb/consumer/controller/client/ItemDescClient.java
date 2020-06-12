package com.wsb.consumer.controller.client;

import com.wsb.consumer.pojo.ItemDesc;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "wsb-tb-item-desc")
public interface ItemDescClient {
    @GetMapping("item/desc/findById/{id}")
    ItemDesc findById(@PathVariable("id") Long id);

    @DeleteMapping("item/desc/delete/{id}")
    int deleteById(@PathVariable("id") Long id);

    @PostMapping("item/desc/add")
    int addItemDesc(@RequestBody ItemDesc itemDesc);

    @PutMapping("item/desc/update")
    int update(@RequestBody ItemDesc itemDesc);
}