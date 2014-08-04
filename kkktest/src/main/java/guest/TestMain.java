package guest;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain
{
//	   @Autowired
	    GuestDao guestDao = new GuestDao();
	
	public static void main(String[] args)
	{
	          
//	          ApplicationContext context = new ClassPathXmlApplicationContext(  
//	                  new String[] {"applicationContext.xml"});  
//	          
//	          
//	          BeanFactory factory = (BeanFactory) context;
//	          EntityManagerFactory emf = (EntityManagerFactory )factory.getBean("emf");
//	          EntityManager em = emf.createEntityManager();
////	          EntityManager em = (EntityManager)factory.getBean("emf");
//
////	          GuestDao gd = (GuestDao)factory.getBean("GuestDao");    
//	          
//	          
//	          TestMain tm = new TestMain();
//	          Scanner input=new Scanner(System.in);
//
//	          em.persist(new Guest("kkk"));
////	          gd.persist(new Guest("kkk"));
//
//	          em.flush();
//	  		int x=input.nextInt();
//	  		while(x != 0) {
//		          em.persist(new Guest("kkk"+ x));
//		          em.flush();
//		          
//		          x=input.nextInt();
////	  			gd.persist(new Guest("kkk" + x));
//	  		}
//		
	}

}
