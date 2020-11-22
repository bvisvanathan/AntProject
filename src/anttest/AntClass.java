package anttest;

import java.util.Date;

import org.testng.annotations.Test;

public class AntClass {
	
	@Test
    public void Test1() {
        // TODO Auto-generated method stub
        
           
		 System.out.println("HELLO ANT PROGRAM");                            
		    System.out.println("TODAY's DATE IS->"+ currentDate() );    
		    }
	
	  public static String currentDate(){                            
	        return new Date().toString();    
	        
	    }
    

}
