package com.wsb.consumer.controller.client;

import com.wsb.consumer.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "wsb-tb-item")
public interface ItemClient {
    @GetMapping("item/findById/{id}")
    Item findById(@PathVariable("id") Long id);

    @PostMapping("item/addItem")
    Long addItem(@RequestBody Item item);

    @DeleteMapping("item/delete/{id}")
    int deleteItem(@PathVariable("id") Long id);

    @PutMapping("item/updateById")
    int updateItemById(@RequestBody Item item);

    @GetMapping("item/finAll")
    List<Item> findAllItem();
}
