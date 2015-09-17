import java.util.Scanner;


public class Exercise3_3 
{

	public static void main(String[] args) 
	{
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Enter Username:");
	String s1, s2;
	s1 = keyboard.nextLine();
	System.out.println("Enter Password:");
	s2 = keyboard.nextLine();
	String username = "Evan";
	String password = "12345";
	if (s1.equals(username) && s2.equals(password))
		{
		System.out.println("Welcome " + username);
		}
	else 
		{
		System.out.println("Wrong Username or Password!");
		}
	}
}
