package com.keven.rest;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.keven.model.OrderEntry;


/**
 * NOTE: These are intended ONLY for automation test cases. Developers should refrain from using this API.
 */

//@Consumes(MediaType.APPLICATION_JSON)
@Path("/lmtest")
public interface TestWs {


    @GET
//    @Produces(MediaType.APPLICATION_JSON)
    @Path("/query")
    public String getData();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/query")
    public Collection<OrderEntry> getData(@QueryParam("id") long id);
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public OrderEntry create(@QueryParam("ordernum") String orderNumber, @QueryParam("quantity") int quantity, @QueryParam("note") String note);
    
}
