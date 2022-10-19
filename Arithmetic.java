package secondproject;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String args[]) {
	
	int a,b,c;
	
	Scanner ar= new Scanner(System.in);
	System.out.println("Enter a value");
	a= ar.nextInt();
	System.out.println("Enter b value");
	b= ar.nextInt();
	
	System.out.println("Addition :"+(a+b));
	}
}