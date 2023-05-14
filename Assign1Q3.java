package IACSD;
//3:Write a program to swap two numbers.

public class Assign1Q3 {

	public static void main(String[] args) {
		
		int x=10, y = 20;
		
		System.out.println("Before Swap x="+x+"  y="+y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swap x="+x+"  y="+y);
		

	}

}

