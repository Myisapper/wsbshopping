package com.wsb.item.service.service.impl;

import com.wsb.item.dao.ItemMapper;
import com.wsb.item.pojo.Item;
import com.wsb.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Item> findAllItem() {
        List<Item> list = itemMapper.findAllItem();
        return list;
    }

    @Override
    public Long addItem(Item item) {
         itemMapper.addItem(item);
        return item.getId();
    }

    @Override
    public int deleteItemById(Long id) {
        int i = itemMapper.deleteItemById(id);
        return i;
    }

    @Override
    public Item findItemByid(Long id) {
        Item item = itemMapper.findItemByid(id);
        return item;
    }

    @Override
    public int updateItemById(Item item) {
        int i = itemMapper.updateItemById(item);
        return i;
    }
}
