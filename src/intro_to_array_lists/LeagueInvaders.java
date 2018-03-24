package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
GamePanel panel;

	LeagueInvaders() {
		frame = new JFrame();
		panel = new GamePanel();
		
	}

	final static int w = 500;
	final static int h = 800;

	public static void main(String[] args) {
		LeagueInvaders invaders = new LeagueInvaders();
		invaders.setup();
		// TODO Auto-generated method stub
	}

	void setup() {
		frame.add(panel);
		frame.setSize(w, h);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(w, h));
        frame.pack();
        panel.StartGame();
        frame.addKeyListener(panel);
	}
}
