package hellogo;

import java.util.Scanner;

public class Program {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the length of thye array:");
	int length = scan.nextInt();
	int arr[] = new int[length];
	System.out.println("enter the array elements");
	for(int i=0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("enter the element to search");
	int key = scan.nextInt();
	for(int i=0; i<= arr.length-1;i++)
	{
		if(key == arr[i])
		{
			System.out.println("the key element is found at index of "+(i));
			System.out.println(exit(0));
		}
	}
}

private static char[] exit(int i) {
	// TODO Auto-generated method stub
	return null;
}
}
