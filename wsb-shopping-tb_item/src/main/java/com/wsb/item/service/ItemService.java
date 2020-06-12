package com.wsb.item.service;

import com.wsb.item.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> findAllItem();
    Long addItem(Item item);
    int deleteItemById(Long id);
    Item findItemByid(Long id);
    int updateItemById(Item item);
}
