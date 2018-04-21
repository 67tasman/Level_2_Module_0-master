package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{

	Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	  void update() {
		  super.update();
		  y=y+1;
	    	
	    }
	   void draw(Graphics g) {
		    g.setColor(Color.YELLOW);

	        g.drawRect(x, y, width, height);
	        g.drawImage(GamePanel.alienImg, x, y, width, height, null);


	    }

}
