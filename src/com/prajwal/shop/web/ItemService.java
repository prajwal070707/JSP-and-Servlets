package com.prajwal.shop.web;

import java.util.ArrayList;
import java.util.List;

import com.prajwal.shop.domain.Item;

public class ItemService {
	
	public List<Item> fetchAll(){
		List<Item> items=new ArrayList<>();
		items.add(new Item(1,"Lamp", 24.5f));
		items.add(new Item(2,"Chair", 34.5f));
		items.add(new Item(3,"Table", 44.5f));		
		
		return items;
	}
	
	

}
