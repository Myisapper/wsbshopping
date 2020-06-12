package com.wsb.item.dao;


import com.wsb.item.common.R;
import com.wsb.item.pojo.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMapper {
    //@Select("select *from tb_item")
    List<Item> findAllItem();

    Item findItemByid(Long id);

    int addItem(Item item);

    int deleteItemById(Long id);

    int updateItemById(Item item);
}
