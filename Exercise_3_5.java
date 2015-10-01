import javax.swing.JOptionPane;

public class Exercise_3_5
{
	private static String[] AccountType={"Administrator", "Faculty", "Staff", "Student", "Guest"};
	public static void main(String[] args)
	{
		String Input=(String)(JOptionPane.showInputDialog(null, "Select your account type.", "AccountType", JOptionPane.PLAIN_MESSAGE, null, AccountType, "input"));
		String choices2 = Input.toString();
		switch(choices2)
		{
		case "Admininistrator":
			JOptionPane.showMessageDialog(null, "Welcome, Admin!");
		break;
		case "Faculty":
			JOptionPane.showMessageDialog(null, "Welcome, Faculty!");
		break;	
		case "Staff":
			JOptionPane.showMessageDialog(null, "Welcome, Staff!");
		break;
		case "Student":
			JOptionPane.showMessageDialog(null, "Welcome, Student!");
		break;
		case "Guest": 
			JOptionPane.showMessageDialog(null, "Welcome, Guest!");
		break;
		}
	}
}	
