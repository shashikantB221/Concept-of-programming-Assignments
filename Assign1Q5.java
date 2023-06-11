package IACSD;
import java.util.Scanner;
//5:Write a program to find m to the power n.
public class Assign1Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and power");
		
		int base = sc.nextInt();
		int exponent =sc.nextInt();

	    long result = 1;

	    while (exponent != 0) {
	      result *= base;
	      --exponent;
	    }

	    System.out.println(" base ^ power ="+ result);
		

	}

}
