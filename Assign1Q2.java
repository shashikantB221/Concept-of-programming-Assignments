package IACSD;
import java.util.Scanner;
//2:Write a program to addition of two numbers .

public class Assign1Q2 {

	public static void main(String[] args) {

		int x, y, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x=");
		x = sc.nextInt();
		System.out.println("Enter y=");
		y = sc.nextInt();

		res = x + y;
		System.out.println("Addition x + y = " + res);

	}

}
