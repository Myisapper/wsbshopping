package com.wsb.item.desc.service;

import com.wsb.item.desc.mapper.ItemDescMapper;
import com.wsb.item.desc.pojo.ItemDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemDescService {//根据id查询
    @Autowired
    private ItemDescMapper itemDescMapper;
    public ItemDesc findById(Long id){
        ItemDesc itemDesc = itemDescMapper.findById(id);
        return itemDesc;
    }

    public int addItemDesc(ItemDesc itemDesc){//添加数据
        int i = itemDescMapper.addItemDesc(itemDesc);
        return i;
    }

    public int deleteItemDescById(Long id){//根据id删除
        int i = itemDescMapper.deleteItemDescById(id);
        return i;
    }

    public int updateItemDescById(ItemDesc itemDesc){//根据id修改
        int i = itemDescMapper.updateItemDescById(itemDesc);
        return i;
    }
}
