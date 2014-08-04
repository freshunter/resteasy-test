package guest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;


@Path("/hello")
public class RestHello
{  
	  
	   @GET
//	   @Path("data")  
	   public String getAll()  
	   {  
	      return "Hello Rest";  
	   }  
	}  
