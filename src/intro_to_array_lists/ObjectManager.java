package intro_to_array_lists;

import java.awt.Graphics;

public class ObjectManager {
Rocketship Rocket;

ObjectManager(Rocketship Rocket){
	this.Rocket=Rocket;
}

void update(){
	Rocket.update();
}
void draw(Graphics g) {
	Rocket.draw(g);
}
}
