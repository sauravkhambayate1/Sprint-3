package com.satya.ItemsAPI.service;

import com.satya.ItemsAPI.repository.entity.Item;

import java.util.List;

public interface ItemService
{

    Item save( Item item );

    void delete( int itemId );

    List<Item> all();

    Item findById( int itemId );

}
