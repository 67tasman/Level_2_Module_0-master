package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	int speed;

	Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 5;

	}
	// TODO Auto-generated constructor stub

	void update() {
		super.update();
		
	}

	void draw(Graphics g) {
	    g.drawImage(GamePanel.rocketImg, x, y, width, height, null);
		//g.fillRect(collisionBox.x, collisionBox.y, collisionBox.width, collisionBox.height);

	}
}