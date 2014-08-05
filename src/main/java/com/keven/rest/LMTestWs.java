package com.keven.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.ext.Provider;


/**
 * NOTE: These are intended ONLY for automation test cases. Developers should refrain from using this API.
 */

//@Consumes(MediaType.APPLICATION_JSON)
//@Provider
@Path("/lmtest")
public interface LMTestWs {


    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/query")
    public String getData(@QueryParam("param-name") String paramName);
    
}
