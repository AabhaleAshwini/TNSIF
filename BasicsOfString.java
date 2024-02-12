package Strings;

import java.util.Scanner;

public class BasicsOfString 
{
	public static void main(String args[])
	{
		char arr[] = {'a','b','c','d'};
		String str ="abcd";
		String str2 = new String("xyz");
		
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name =sc.next();
		
		//System.out.println("Enter your Address");
		//String sent =sc.nextLine();
		
		System.out.println(name);
		//System.out.println(sent);
		
		
		String fullname = "Ashwini Aabhale";
		System.out.println(fullname.length());                      //To show the length of string
		
		//Concatination 
		String fname ="Ashwini";
		String lname = "Aabhale";
		String funame = fname+ " " + lname;
		System.out.println(funame);
	}
}
