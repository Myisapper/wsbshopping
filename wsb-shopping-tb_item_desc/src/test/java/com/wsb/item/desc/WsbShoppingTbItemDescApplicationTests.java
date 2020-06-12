package com.wsb.item.desc;

import com.wsb.item.desc.mapper.ItemDescMapper;
import com.wsb.item.desc.pojo.ItemDesc;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class WsbShoppingTbItemDescApplicationTests {
    @Autowired
    private ItemDescMapper itemDescMapper;

    @Test
    void contextLoads() {
    }
    @Test
    void testfindById(){
        ItemDesc itemdesc = itemDescMapper.findById(1L);
        System.out.println(itemdesc);
    }
    @Test
    void testdeleteById(){
        int i = itemDescMapper.deleteItemDescById(2L);
        System.out.println(i);
    }
    @Test
    void testadd(){
        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setItemId(3L);
        itemDesc.setItemDesc("小学生必学人教版教科书");
        itemDesc.setCreated(new Date());
        itemDesc.setUpdated(new Date());
        int i = itemDescMapper.addItemDesc(itemDesc);
        System.out.println(i);
    }
    @Test
    void testUpdata(){
        ItemDesc itemDesc = new ItemDesc();
        itemDesc.setItemId(3L);
        itemDesc.setItemDesc(null);
        itemDesc.setCreated(new Date());
        itemDesc.setUpdated(new Date());
        int i = itemDescMapper.updateItemDescById(itemDesc);
        System.out.println(i);
    }

}
