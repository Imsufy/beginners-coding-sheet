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
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first Number");
	int num1 = sc.nextInt();
	System.out.println("Enter Second Number");
	int num2 = sc.nextInt();
	int quotient = num1 / num2;
	int remainder = num1 % num2;
	System.out.println("quotient of this two number is:" + quotient);
	System.out.println("remainder of this two number is:" + remainder);
	}
}
