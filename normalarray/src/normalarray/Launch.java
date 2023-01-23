package normalarray;

import java.util.Scanner;

public class Launch {
public static void main(String []args)
{
	Scanner scan = new Scanner(System.in);
	int []arr = new int[5];
	System.out.println("Enter the array elements");
	arr[0] = scan.nextInt();
	arr[1] = scan.nextInt();
	arr[2] = scan.nextInt();
	arr[3] = scan.nextInt();
	arr[4] = scan.nextInt();
	System.out.println("The array elements are:");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);

}
}
