package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
Rocketship Rocket;
ArrayList<Projectile> projectiles  = new ArrayList<Projectile>();
ObjectManager(Rocketship Rocket){
	this.Rocket=Rocket;
}
void addProjectile(Projectile p){
   	projectiles.add(p);
   
}
void update(){
	for(int i=0 ; i< projectiles.size() ; i++) {
	projectiles.get(i).update();
	}
}
void draw(Graphics g) {
	Rocket.draw(g);
	for(int i=0 ; i< projectiles.size() ; i++) {
		projectiles.get(i).draw(g);
		}
}


}
