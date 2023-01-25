import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class PhoneDialer implements ActionListener {
	private JFrame myFrame;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine, dash, dialNumber;
	private String phoneNumber = "";
	
	public PhoneDialer() {
		// initialize
		myFrame = new JFrame();
		myFrame.setTitle("Jingyuan's Dialer");
		myFrame.setSize(200, 250);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// content
		JPanel content = (JPanel)myFrame.getContentPane();
		BoxLayout box = new BoxLayout(content, BoxLayout.Y_AXIS);
		content.setLayout(box);
		Border paddingContent = BorderFactory.createEmptyBorder(10,10,10,10);
		content.setBorder(paddingContent);
		
		//top
		JPanel topLabel = new JPanel();
		topLabel.setLayout(new FlowLayout());
		JLabel title = new JLabel("Enter the number to dial:");
		topLabel.add(title);
		
		//buttons
		JPanel buttons = new JPanel();
		GridLayout grid = new GridLayout(4,3,5,5);
		buttons.setLayout(grid);
		Border paddingButtons = BorderFactory.createEmptyBorder(5,5,5,5);
		content.setBorder(paddingButtons);
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		dash = new JButton("-");
		
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(dash);
		buttons.add(zero);
		
		// add to parent
		content.add(topLabel);
		content.add(buttons);
		
		// dial
		dialNumber = new JButton("Dial Number");
		dialNumber.setAlignmentX(Component.CENTER_ALIGNMENT);
		content.add(dialNumber);
		
		//buttonHandler.cpp from VEX-Spin-Up-285X.zip
		zero.addActionListener(this);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		dash.addActionListener(this);
		zero.addActionListener(this);
		dialNumber.addActionListener(this);
		
		// show
		myFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		Object director = event.getSource();
		if(director == dialNumber) {
			JOptionPane.showMessageDialog(null, "Dialing: " + phoneNumber);
			phoneNumber = "";
		}
		else if(director == zero) {
			phoneNumber = phoneNumber + "0";
		}
		else if(director == one) {
			phoneNumber = phoneNumber + "1";
		}
		else if(director == two) {
			phoneNumber = phoneNumber + "2";
		}
		else if(director == three) {
			phoneNumber = phoneNumber + "3";
		}
		else if(director == four) {
			phoneNumber = phoneNumber + "4";
		}
		else if(director == five) {
			phoneNumber = phoneNumber + "5";
		}
		else if(director == six) {
			phoneNumber = phoneNumber + "6";
		}
		else if(director == seven) {
			phoneNumber = phoneNumber + "7";
		}
		else if(director == eight) {
			phoneNumber = phoneNumber + "8";
		}
		else if(director == nine) {
			phoneNumber = phoneNumber + "9";
		}
		else if(director == dash) {
			phoneNumber = phoneNumber + "-";
		}
		
	}
}
