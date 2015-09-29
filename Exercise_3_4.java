import javax.swing.JOptionPane;

public class Exercise_3_4
{
	
	public static void main(String[] args)
	{
	String numPeople1, numPlayers1;
	int groupSize, numPeople2, teamSize, numPlayers2;
	numPeople1 = "";
	numPlayers1 = "";
	groupSize = 0;
	numPeople2 = 0;
	numPlayers2 = 0;
	teamSize = 0;

	numPeople1 = JOptionPane.showInputDialog("Enter the number of people:");
	numPeople2 = Integer.parseInt(numPeople1);
	
	if (numPeople2 >= 10)
		{
		groupSize = (numPeople2/2);
		}
	else if (numPeople2 >= 3)
		{
		groupSize = (numPeople2/3);
		}
	else
		{
		JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
		}
	JOptionPane.showMessageDialog(null, "The group size is: " + groupSize);
	
	numPlayers1 = JOptionPane.showInputDialog("Enter the number of players:");
	numPlayers2 = Integer.parseInt(numPlayers1);

	if ((numPlayers2 >= 11) && (numPlayers2 <= 55))
		{
		teamSize = (numPlayers2/11);
		}
	else 
		{
		teamSize = 1;
		}
	JOptionPane.showMessageDialog(null, "The team size is: " + teamSize);

	}
}
