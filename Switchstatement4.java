import java.util.Scanner;

public class Switchstatement4 {

		public static void main(String[] args) {
			Scanner mon =new Scanner(System.in);
		System.out.println("enter months");
		String c = mon.next(); 
	    switch(c) {
	    case "jan":
	    	System.out.println("january");
	    	break;
	    case "feb":
	    	System.out.println("february");
	    	break;
	    case "mar":
	    	System.out.println("march");
	    	break;
	    case "apr":
	    	System.out.println("april");
	    	break;
	    case "may":
	    	System.out.println("may");
	    	break;
	    case "jun":
	    	System.out.println("june");
	    	break;
	    case "aug":
	    	System.out.println("august");
	    	break;
	    case "sep":
	    	System.out.println("september");
	    	break;
	    case "oct":
	    	System.out.println("october");
	    	break;
	    case "nov":
	    	System.out.println("november");
	    	break;
	    case "dec":
	    	System.out.println("december");
	    	break;
	    default:
            System.out.println("thanks namastey");
	}
  
 }
}