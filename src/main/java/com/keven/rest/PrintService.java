package com.keven.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.keven.customer.CustomerBo;

@Component
@Path("/customer")
public class PrintService {

	@Autowired
	ApplicationContext applicationContext;
	

	@GET
	@Path("/print")
	public Response printMessage() {

		CustomerBo customerBo = (CustomerBo) applicationContext.getBean("customerBo");
		
		String result = customerBo.getMsg();

		return Response.status(200).entity(result).build();

	}

}