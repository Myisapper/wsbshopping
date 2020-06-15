package com.wsb.consumer.controller;

import com.wsb.consumer.common.R;
import com.wsb.consumer.controller.client.ItemClient;
import com.wsb.consumer.controller.client.ItemDescClient;
import com.wsb.consumer.pojo.Item;
import com.wsb.consumer.pojo.ItemDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableFeignClients//开启Feign客户端
@CrossOrigin
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private ItemClient itemClient;
    @Autowired
    private ItemDescClient itemDescClient;
    @GetMapping("findItemById/{id}")
    public Item findById(@PathVariable("id") Long id){
        Item item = itemClient.findById(id);
        return item;
    }
    @DeleteMapping("deleteItemById/{id}")
    public int deleteItem(@PathVariable("id") Long id){
        int i = itemClient.deleteItem(id);
        itemDescClient.deleteById(id);
        return i;
    }
    @PutMapping("updateItemById")
    public int updateItemById(@RequestBody Item item){
        int i = itemClient.updateItemById(item);
        return i;
    }
    @GetMapping("finAllItem")
    public List<Item> findAll(){
        List<Item> list = itemClient.findAllItem();
        return list;
    }

    @PostMapping("addItem")
    public int addItem(@RequestBody Param param){
        Long i = itemClient.addItem(param.item);
        param.itemDesc.setItemId(i);
        int y = itemDescClient.addItemDesc(param.itemDesc);
        return y;
    }
    //////
    @GetMapping("findItemDescById/{id}")
    public ItemDesc findItemDescById(@PathVariable("id") Long id){
        ItemDesc itemDesc = itemDescClient.findById(id);
        return itemDesc;
    }

    @PostMapping("addItemDesc")
    public int addItemDesc(@RequestBody ItemDesc itemDesc){
        int i = itemDescClient.addItemDesc(itemDesc);
        return i;
    }

    @DeleteMapping("deleteById/{id}")
    public int deleteById(@PathVariable("id") Long id){
        int i = itemDescClient.deleteById(id);
        return i;
    }

    @PutMapping("updateItemDescById")
    public int updateItemDescById(@RequestBody ItemDesc itemDesc){
        int i = itemDescClient.update(itemDesc);
        return i;
    }



}
class Param{
    public Item item;
    public ItemDesc itemDesc;
}
