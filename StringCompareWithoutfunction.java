package Strings;

public class StringCompareWithoutfunction 
{
	public static void main(String args[])
	{
		String s1 ="Ashu";
		String s2 ="Ashu";
		String s3= new String("Ashu");                 //This string creates new place in memory thats why its not showing equal.
		if(s1==s2) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		
		if(s1==s3)
		{
			System.out.println("Strings are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
	}
}
