package intro_to_array_lists;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
 

public class GuestBook implements ActionListener{
	public static void main(String[] args) {
		// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
		GuestBook book = new GuestBook();
		book.GUI();
	book.view();

	
}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	
	JFrame frame2 = new JFrame();
	JPanel panel2 = new JPanel();
	JLabel label2 = new JLabel();
	//TextField text2 = new TextField();
	public void GUI() {
		
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		frame.pack();
		
		
		}
	public void view() {
		frame2.add(panel2);
		panel2.add(label2);
		frame.pack();
	
	}
	ArrayList<String> names = new ArrayList<String>();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(button==e.getSource()) {
			names.add(JOptionPane.showInputDialog("Enter a name"));
			}

		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			label2.setText("String at element " + i + " " + s);
		}
		if(button2==e.getSource()) {
			frame2.setVisible(true);
			}
	}
	
}