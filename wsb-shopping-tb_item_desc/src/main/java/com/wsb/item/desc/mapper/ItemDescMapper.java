package com.wsb.item.desc.mapper;

import com.wsb.item.desc.pojo.ItemDesc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemDescMapper {
    ItemDesc findById(Long id);

    int addItemDesc(ItemDesc itemDesc);

    int deleteItemDescById(Long id);

    int updateItemDescById(ItemDesc itemDesc);
}
