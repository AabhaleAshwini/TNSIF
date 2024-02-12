package Strings;

public class StringCompareWithFunction 
{
	public static void main(String args[])
	{
		String s1 ="Ashu";
		String s2 ="Ashu";
		String s3= new String("Ashu"); 
		
		if(s1==s2) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}

		
		if(s1.equals(s3))
		{
			System.out.println("Strings are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
	}
}
