package com.te.e_comSpringRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.e_comSpringRest.bean.Admin;
import com.te.e_comSpringRest.bean.Item;
import com.te.e_comSpringRest.dao.EcomDAOImpl;


@Service
	public class EcomServiceImpl  implements EcomService{

		@Autowired
		EcomDAOImpl ecomDao;
		
		@Override
		public Admin authenticate(Integer id, String password) {
			
			Admin admin = ecomDao.authenticate(id, password);
			return admin;
		}

		@Override
		public boolean addItem(Item item) {
			boolean result = ecomDao.addItem(item) ;
			return result;
		}

		@Override
		public boolean removeItem(Integer id) {
			boolean result = ecomDao.removeItem(id);
			return result;
		}

		@Override
		public Item searchItem(Integer id) {
			Item item = ecomDao.searchItem(id);
			return item;
		}

		@Override
		public List<Item> getAllItems() {
			List<Item> list = ecomDao.getAllItems();
			return list;
		}

		@Override
		public boolean updateItem(Item item) {
			boolean result = ecomDao.updateItem(item);
			return result;
		}
}
