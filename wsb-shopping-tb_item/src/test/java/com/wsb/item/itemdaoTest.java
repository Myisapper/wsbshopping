package com.wsb.item;

import com.wsb.item.dao.ItemMapper;
import com.wsb.item.pojo.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class itemdaoTest {
    @Autowired
    private ItemMapper itemMapper;
    @Test
    public void findItems(){
        List<Item> items = itemMapper.findAllItem();
        System.out.println(items);
    }
    @Test
    public void addItems(){
        Item item = new Item();
        item.setTitle("语文课本");
        item.setSellPoint("小学生必背");
        item.setPrice(1000L);
        item.setNum(200);
        item.setBarcode("19998");
        item.setImage("www.66666.com");
        item.setCid(2L);
        item.setStatus(1);
        item.setCreated(new Date());
        item.setUpdated(new Date());
        System.out.println(item);
        int i = itemMapper.addItem(item);
        System.out.println(i);
    }
    @Test
    public void deleteItemById(){
        int i = itemMapper.deleteItemById(9L);
        System.out.println(i);
    }
    @Test
    public void findItemById(){
        Item item = itemMapper.findItemByid(1L);
        System.out.println(item);
    }
    @Test
    public void updateItemById(){
        Item item = new Item();
        item.setId(3L);
        item.setTitle("哲学课本");
        item.setSellPoint("小学生不能看");
        item.setPrice(3000L);
        item.setNum(2);
        item.setBarcode("66666");
        item.setImage("www.66666.com");
        item.setCid(2L);
        item.setStatus(1);
        item.setCreated(new Date());
        item.setUpdated(new Date());
        int i = itemMapper.updateItemById(item);
        System.out.println(i);
    }
}
