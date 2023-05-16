
package IACSD;
import java.util.Scanner;
//3:Write a program to calculate factorial of number.

public class Assign1Q4 {

	public static void main(String[] args) {
		int fact = 1, i, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for calculate factorial");
		n = sc.nextInt();

		
		for (i = n; i>=1; i--) {
			fact = fact*i;
		}
		
		System.out.println("factorial ="+fact);

		}

}

