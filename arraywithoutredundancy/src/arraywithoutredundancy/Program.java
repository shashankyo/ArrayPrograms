package arraywithoutredundancy;

import java.util.Scanner;

public class Program {
public static void main(String []args)

{
	Scanner scan = new Scanner(System.in);
	String []arr = new String[10];
	for (int i=0; i<=9; i++)
	{
		System.out.println("enter the name of "+(i+1)+"student");
		arr[i] = scan.next();
	}
	System.out.println("the names of the students atre");
	for(int i=0;i<=9;i++)
	{
		System.out.println(arr[i]);
	}
	
}
}
