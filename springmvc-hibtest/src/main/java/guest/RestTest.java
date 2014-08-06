package guest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/test")  
public class RestTest  
{  
   @Autowired  
   private GuestDao guestDao; 
  
   @GET  
   @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})  
   @Path("data")  
   public List<Guest> getAll()  
   {  
      return guestDao.getAllGuests();  
   }  
   
   @GET  
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)  
   @Produces(MediaType.TEXT_HTML)  
   @Path("data/set/{name}")  
   public List<Guest> saveGuest(@PathParam("name") String name)
   {  
	   guestDao.persist(new Guest(name));  
      return guestDao.getAllGuests();  
   }  
  
//   @PUT  
//   @POST  
//   @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})  
//   @Path("data")  
//   public Response saveContact(@Context UriInfo uri, Guest contact)  
//         throws URISyntaxException  
//   {  
//      guestDao.persist(contact);  
//      URI newURI = UriBuilder.fromUri(uri.getPath()).path(contact.getClass()LastName()).build();  
//      return Response.created(newURI).build();  
//   }  
  
//   @GET  
//   @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})  
//   @Path("data/{lastName}")  
//   public Contact get(@PathParam("lastName") String lastName)  
//   {  
//      return guestDao.get(lastName);  
//   }  
  
//   @POST  
//   @PUT  
//   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)  
//   @Produces(MediaType.TEXT_HTML)  
//   public ModelAndView saveContactForm(@Form Guest contact)  
//         throws URISyntaxException  
//   {  
//      guestDao.persist(contact);  
//      return viewAll();  
//   }  
//     
//   @GET  
//   @Produces(MediaType.TEXT_HTML)  
//   public ModelAndView viewAll()  
//   {  
//      // forward to the "Guest" view, with a request attribute named  
//      // "Guest" that has all of the existing Guest  
//      return new ModelAndView("Guest", "Guest", guestDao.getAllGuests());  
//   }  
}  
