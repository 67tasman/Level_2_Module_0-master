package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practiceTest implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JTextField text = new JTextField(10);
	String answer = "yes";
	public static void main(String[] args) {
		practiceTest  test = new practiceTest();
		test.thing();

}
	void thing() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(label);
		panel.add(text);
		button1.setText("Submit");
		button1.addActionListener(this);
		button2.setText("Hint");
		button2.addActionListener(this);
		label.setText("Did the chicken cross the road?");
		frame.setSize(500, 200);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(button1==e.getSource()) {
			if(text.getText()=="yes") {
				System.out.println("Correct");
			}
			else{
					System.out.println("Wrong");
				}
					
			}
		if(button2==e.getSource()) {
			System.out.println("It lives in the city.");
		}
		
	}
	
	
}