package company;

import java.util.Scanner;

public class Program {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	String [][]arr = new String[5][];
	
	arr[0] = new String[3];
	arr[1] = new String[2];
	arr[2] = new String[4];
	arr[3] = new String[1];
	arr[4] = new String[3];
	
	
	System.out.println("Enter the names of the employees working in the company");
	for(int i=0; i<= arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter the name of " +(j+1)+" of the employees " +(i+1)+" is");
			arr[i][j] = scan.next();
			
		}
	}
	System.out.println("The names of the employees are:");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println(arr[i][j]+"");
		}
	}
}
}
