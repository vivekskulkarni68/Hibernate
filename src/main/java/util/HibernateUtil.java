package util;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {
	static SessionFactory factory=null;
	static{
	try{
	    factory = new Configuration().configure().buildSessionFactory();
	    		
		}catch(Throwable th){
			th.printStackTrace();
			System.err.println("Exception in creating session Factory"+th);
		}
	}
   public static SessionFactory getSessionFactory(){
	   return factory;
   }

}
