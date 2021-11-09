import java.util.Scanner;


public class Switchstatements {

	public static void main(String[] args) {
	
	Scanner in =new Scanner(System.in);
	System.out.println("enter an integer");
	int num  = in.nextInt();
	switch(num%2) {
	
	case 0:
		System.out.println("It is an even number");
		break;
	case 1:
		System.out.println(" It is an odd number");
		break;

		
	}
	
	}

}
