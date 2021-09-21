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
	   int year= sc.nextInt();
	   if(year % 4 ==0){
	       System.out.println("year is leap year");
	   }else if(year % 100==0){
	       System.out.println("year is leap year");
	   }else if (year % 400==0){
	   System.out.println("year is leap year");
	   }else{
	       System.out.println("year is not a leap year");
	   }

	   }
	}
