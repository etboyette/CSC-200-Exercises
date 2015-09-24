import java.util.Scanner;

public class Assignment2 
{
	
	public static void main(String[] args) 
	{
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter five numbers seperated by spaces.");
	int n1, n2, n3, n4, n5;
	n1 = keyboard.nextInt();
	n2 = keyboard.nextInt();
	n3 = keyboard.nextInt();
	n4 = keyboard.nextInt();
	n5 = keyboard.nextInt();
	System.out.println("Sum: " + (n1 + n2 + n3 + n4 + n5));
	System.out.println("Average: " + (n1 + n2 + n3 + n4 + n5)/5);
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	if (n1 < min) 
		{
		min = n1;
		}
	if (n2 < min) 
		{
		min = n2;
		}
	if (n3 < min) 
		{
		min = n3;
		}
	if (n4 < min) 
		{
		min = n4;
		}
	if (n5 < min) 
		{
		min = n5;
		}
	if (n1 > max)
		{
		max = n1;
		}
	if (n2 > max)
		{
		max = n2;
		}
	if (n3 > max)
		{
		max = n3;
		}
	if (n4 > max)
		{
		max = n4;
		}
	if (n5 > max)
		{
		max = n5;
		}
	System.out.println("Min: " + min);
	System.out.println("Max: " + max);
	//int med = max - min
	}

}