package doolinfo;

import java.util.Scanner;

public class Program {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	int [][][] arr = new int [2][3][2];
	System.out.println("Enter the ages of the students");
	for( int i=0; i<= arr.length-1; i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println("The age of the student of " + (k+1)+" of the class " +(j+1)+ " of school "+(i+1));
				arr[i][j][k] = scan.nextInt();
				
			}
		}
	}
	System.out.println("The ages of the students are:");
	for(int i= 0;i<=arr.length-1;i++)
	{
		for(int j=0; j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				System.out.println(arr[i][j][k]+"");
			}
		}
		System.out.println();
	}
	
}
}
