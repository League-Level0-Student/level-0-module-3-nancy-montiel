import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	
	String happy= JOptionPane.showInputDialog("Are you happy?");
	if (happy.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else if (happy.equals("no")) {
		String answer=	JOptionPane.showInputDialog("Do you want to be happy?");

	if (answer.equals("no")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else if (answer.equals("yes")) {
		
	JOptionPane.showMessageDialog(null, "Change something.");
	}
}
	}
	}


