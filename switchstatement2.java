import java.util.Scanner;
public class switchstatement2 {

	public static void main(String[] args) {
		Scanner sai =new Scanner(System.in);
	System.out.println("enter vowels");
	String c = sai.next(); 
    switch(c) {
    case "a":
    	System.out.println("vowel");
    	break;
    case "e":
    	System.out.println("vowel");
    	break;
    case "i":
    	System.out.println("vowel");
    	break;
    case "o":
    	System.out.println("vowel");
    	break;
    case "u":
    	System.out.println("vowel");
    	break;
    default:
    		System.out.println("consonant");
    	     break;
    	
    }
	}

}
