package com.keven.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import com.keven.context.SpringApplicationContext;
import com.keven.customer.CustomerBo;

//@Provider
@Path("/customer")
public class PrintService {

	CustomerBo customerBo;

	@GET
	@Path("/print")
	public Response printMessage() {

		customerBo = (CustomerBo) SpringApplicationContext.getBean("customerBo");
		
		String result = customerBo.getMsg();

		return Response.status(200).entity(result).build();

	}

}