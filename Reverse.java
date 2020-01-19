import java.util.*;
public class Reverse
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the no of testcase:");
	int testcase = input.nextInt();
	for(int i=0;i<testcase;i++)
	{
	    System.out.println("Enter the String:");
	    String s = input.next();
	   
	    String s1[] = s.split("[.]");
	  
	    for(int j=s1.length-1;j>=1;j--)
	    {
	        System.out.print(s1[j]+".");
	    }
	    System.out.print(s1[0]);
	}
		}
}
