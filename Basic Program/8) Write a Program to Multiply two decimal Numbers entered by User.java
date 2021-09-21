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
	float num1, num2, result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first decimal");
	num1 = sc.nextFloat();
	System.out.println("Enter Second decimal");
	num2 = sc.nextFloat();
	result = num1 * num2;
	
	System.out.println("multiplication of two decimal is:" + result);
	}
}
