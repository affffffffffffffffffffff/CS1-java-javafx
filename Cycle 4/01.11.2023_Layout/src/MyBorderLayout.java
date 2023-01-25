import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyBorderLayout implements ActionListener {
	// 1. instance var
	JFrame myFrame;
	JButton redButton;
	JButton greenButton;
		
	// 2. method
	// 2.1 constructor
	public MyBorderLayout() {
		// create new JFrame
		myFrame = new JFrame();
		
		JPanel myPanel = (JPanel)myFrame.getContentPane();
		
		// set the frame title, size, location
		myFrame.setTitle("Jingyuan's Window");
		myFrame.setSize(500, 300);
		myFrame.setLocation(10, 10);
		
		// make sure program terminates when window is closed
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// assign a layout
		BorderLayout myLayout = new BorderLayout();
		myPanel.setLayout(myLayout);

		// Label Testing
		JLabel about = new JLabel("Sets color to the button pressed.", JLabel.CENTER);
		myPanel.add(about,BorderLayout.CENTER);
		
		// creates and adds buttons to the frame
		redButton = new JButton("Red");
		greenButton = new JButton("Green");
		
		myPanel.add(redButton,BorderLayout.LINE_START);
		myPanel.add(greenButton,BorderLayout.LINE_END);
		
		// link buttons to our actionPerformed() function
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		// make the frame visible
		myFrame.setVisible(true);
	}//end construct
	
	public void actionPerformed(ActionEvent event) {
		Object director = event.getSource();
		if(director == redButton) {
			myFrame.getContentPane().setBackground(Color.red);
			JOptionPane.showMessageDialog(null, "std::cout << \"red\" << std::endl; was run successfully.");
		}
		else if(director == greenButton) {
			myFrame.getContentPane().setBackground(Color.green);
			JOptionPane.showMessageDialog(null, "std::cout << \"green\" << std::endl; was run successfully.");
		}
	}
}
