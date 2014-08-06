package com.keven.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keven.customer.CustomerBo;

//add Component, it will autowired the attribute and auto scan the rest class.
@Component
@Path("/antest")
public class PrintServiceAn {

	@Autowired
	CustomerBo customerBo;

	@GET
//	@Path("/print")
	public Response printMessage() {

//		customerBo = (CustomerBo) SpringApplicationContext.getBean("customerBo");
		
		String result = customerBo.getMsg();

		return Response.status(200).entity(result).build();

	}

}