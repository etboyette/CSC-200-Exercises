import java.util.Scanner;


public class rectangle 
{
public static void main (String[] args)
	{
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter two numbers for the width and height of a rectangle.");
	Double n1, n2;
	n1 = keyboard.nextDouble();
	n2 = keyboard.nextDouble();
	System.out.println("Width: " + n1);
	System.out.println("Height: " + n2);
	System.out.print("Perimeter: ");
	System.out.println(2 * n1 + 2 * n2);
	System.out.print("Area: ");
	System.out.println(n1 * n2);
	}
}
