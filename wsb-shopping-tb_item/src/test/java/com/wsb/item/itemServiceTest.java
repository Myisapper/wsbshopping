package com.wsb.item;

import com.wsb.item.dao.ItemMapper;
import com.wsb.item.pojo.Item;
import com.wsb.item.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class itemServiceTest {
    @Autowired
    private ItemService itemService;
    @Test
    public void findItems(){
        List<Item> items = itemService.findAllItem();
        System.out.println(items);
    }
    @Test
    public void deleteItem(){
        int i = itemService.deleteItemById(8L);
        System.out.println(i);
    }
    @Test
    public void addItem(){
        Item item = new Item();
        item.setId(null);
        item.setTitle("数学课本");
        item.setSellPoint("小学生必背");
        item.setPrice(1000L);
        item.setNum(200);
        item.setBarcode("19999");
        item.setImage("www.66667.com");
        item.setCid(2L);
        item.setStatus(1);
        item.setCreated(new Date());
        item.setUpdated(new Date());
        Long i = itemService.addItem(item);
        System.out.println(i);
        System.out.println(item);
    }
}
