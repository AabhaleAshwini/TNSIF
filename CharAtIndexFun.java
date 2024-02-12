package Strings;

public class CharAtIndexFun 
{
	public static void printletters(String str)
	{
		for(int i=0;i<str.length(); i++)
		{
			System.out.print(str.charAt(i)+ " ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		String firstName ="Ashwini";
		String lastname = "Aabhale";
		String fullname = firstName + " " + lastname;
		
		printletters(fullname);
	}
}
