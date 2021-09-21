/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num1, num2, t;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first Number");
	num1 = sc.nextInt();
	System.out.println("Enter Second Number");
	num2 = sc.nextInt();
	t=num1;
	num1 = num2;
	num2 = t;
	
	System.out.println("first number is:" + num1);
	System.out.println("second number is:" + num2);
	}
}
