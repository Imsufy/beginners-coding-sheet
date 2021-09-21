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
	   // Write a Program to Check Whether a Character is Vowel or Consonant.
	   //Vowel List: a, e,i,o,u
	   Scanner sc = new Scanner(System.in);
	   String alphabet1= sc.next();
	   String alphabet = alphabet1.toLowerCase();
	   char a1=(alphabet.charAt(0));
	   System.out.println(a1);
	   if(a1== 'a' || a1== 'e' || a1== 'i' || a1== 'o' || a1== 'u'){
	       System.out.println("Vowel");
	   }else{
	       System.out.println("Consonent");
	   }
	}
}