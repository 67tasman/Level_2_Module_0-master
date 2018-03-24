package intro_to_array_lists;

import java.awt.Graphics;

public class GameObject {
	
	int x;

    int y;

    int width;

    int height;
	GameObject(int x, int y, int width, int height){
		this.x = x;
		this.y=y;
		this.width= width;
		this.height = height;
	
	}
	public class Rocketship extends GameObject {

		Rocketship(int x, int y, int width, int height) {
			super(x, y, width, height);
			// TODO Auto-generated constructor stub
			
			  void update() {
				  
			    	
			    }
			   void draw(Graphics g) {
				 
			    }
		}
		
	}
    void update() {
 
    	
    }
   void draw(Graphics g) {
	 
    }
}

