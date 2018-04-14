package intro_to_array_lists;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship Rocket;
	ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> aliens = new ArrayList<Alien>();
	long enemyTimer = 0;
	int enemySpawnTime = 1000;
	private GamePanel gamePanel;
	int score = 0;
	ObjectManager(Rocketship Rocket, GamePanel panel) {
		this.Rocket = Rocket;
		this.gamePanel = panel;
		getScore(); 
	}

	int getScore() {
		return this.score;
		
	
	}
	
	void addProjectile(Projectile p) {
		projectiles.add(p);

	}

	void addAlien(Alien a) {
		aliens.add(a);

	}

	void update() {
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).update();
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).update();
		}
		Rocket.update();
	}

	void draw(Graphics g) {
		Rocket.draw(g);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw(g);
		}
		for (int i = 0; i < aliens.size(); i++) {
			aliens.get(i).draw(g);
		}

	}

	public void manageEnemies() {
		if (System.currentTimeMillis() - enemyTimer >= enemySpawnTime) {
			addAlien(new Alien(new Random().nextInt(LeagueInvaders.w), 0, 50, 50));

			enemyTimer = System.currentTimeMillis();
		}
	}

	void PurgeObjects() {
		for (int i = 0; i < aliens.size(); i++) {
			if (aliens.get(i).isAlive == false) {
				aliens.remove(aliens.get(i));
			}
			if (Rocket.isAlive == false) {
				gamePanel.currentState = gamePanel.END_STATE;
				System.out.println("Rocket dead");
				Rocket.isAlive = true;
			}
		}
	}

	void checkCollision() {
		for (Alien a : aliens) {

			if (Rocket.collisionBox.intersects(a.collisionBox)) {
				System.out.println("rocket collided with alien");
				Rocket.isAlive = false;

			}
			for (Projectile p : projectiles) {

				if (a.collisionBox.intersects(p.collisionBox)) {

					a.isAlive = false;
score++;
				}
			}

		}
	}
}
