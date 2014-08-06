package com.keven.customer.impl;

import org.springframework.stereotype.Repository;

import com.keven.customer.CustomerBo;

@Repository("customerBo")
public class CustomerBoImpl implements CustomerBo {

	public String getMsg() {

		return "RESTEasy + Spring example";
		
	}

}