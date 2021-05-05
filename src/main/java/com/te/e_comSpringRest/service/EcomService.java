package com.te.e_comSpringRest.service;

import java.util.List;

import com.te.e_comSpringRest.bean.Admin;
import com.te.e_comSpringRest.bean.Item;


public interface EcomService {

	public Admin authenticate(Integer id, String password);
	
	public boolean addItem(Item item);
	
	public boolean removeItem(Integer id);
	
	public Item searchItem(Integer id);
	
	public List<Item> getAllItems();
	
	public boolean updateItem(Item item);

	
}
