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
	   int num1= sc.nextInt();
	   if(num1 % 2 == 0){
	       System.out.println("Number is Even");
	   }else if(num1 % 2 != 0){
	       System.out.println("Number is  odd");
	   }
	}
}