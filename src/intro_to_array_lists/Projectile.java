package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Projectile  extends GameObject{
int speed = 10;


	Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	  void update() {
		  y = y-speed;
	    	if( y <= 0 ){
	    		isAlive=false;
	    	}
	    }
	   void draw(Graphics g) {
		   g.setColor(Color.RED);

	        g.drawRect(x, y, width, height);
	   }
	  

}
