package com.keven.rest;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keven.db.DataBean;
import com.keven.model.OrderEntry;

@Component
public class TestWsImpl implements TestWs {

	@Autowired
	DataBean db;
	
    @Override
    public String getData() {
    	return "KKK test ";
    }
    
    @Override
	public Collection<OrderEntry> getData(long id) {
		if(id != 0) {
			return Arrays.asList(db.getOrderEntryById(id));
		} else {
			return db.getAllOrderEntry();
		}
	}


	@Override
	public OrderEntry create(String orderNumber, int quantity, String note) {
		return db.persistOrderEntry(orderNumber, quantity, true, note);
	}

}
