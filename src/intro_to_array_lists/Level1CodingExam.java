package intro_to_array_lists;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam implements ActionListener{
	public static void main(String args[]) {
		Level1CodingExam exam = new Level1CodingExam();
		exam.GUI();
		
	}
	
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	String words = "";
	String y = "Yellow";
	String r = "Red";
	String b = "Blue";
	String g = "Green";


void GUI() {
	frame = new JFrame();
	panel = new JPanel();
	b1 = new JButton();
	b2 = new JButton();
	b3 = new JButton();
	b4 = new JButton();
	frame.add(panel);
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(b4);
	b1.setBackground(Color.YELLOW);
	b1.setOpaque(true);
	b1.addActionListener(this);
	b2.setBackground(Color.RED);
	b2.setOpaque(true);
	b2.addActionListener(this);
	b3.setBackground(Color.BLUE);
	b3.setOpaque(true);
	b3.addActionListener(this);
	b4.setBackground(Color.GREEN);
	b4.setOpaque(true);
	b4.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
	
}
void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words);
	} catch (IOException e) {
		e.printStackTrace();
	
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(b1==e.getSource()) {
		speak(y);
		
	}
	if(b2==e.getSource()) {
		speak(r);
		
	}
	if(b3==e.getSource()) {
		speak(b);
		
	}
	if(b4==e.getSource()) {
		speak(g);
		
	}

	
}
}
