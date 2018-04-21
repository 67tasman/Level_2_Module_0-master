package intro_to_array_lists;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;

	int currentState = MENU_STATE;

	Rocketship Rocket;

	ObjectManager OM;

	Font titleFont;
	Font EndFont;
	Font textFont;
	
	 public static BufferedImage alienImg;
     public static BufferedImage rocketImg;
     public static BufferedImage bulletImg;
     public static BufferedImage spaceImg;

	GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48);
		textFont = new Font("Arial", Font.PLAIN, 30);
		EndFont = new Font("Zapfino", Font.PLAIN, 35);
		 try {
             alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
             rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
             bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
             spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
     } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
     }
		 Rocket = new Rocketship(250, 700, 50, 50);
		 OM = new ObjectManager(Rocket, this);
		 
	}

	void StartGame() {
		timer.start();

	}

	@Override

	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}

	}

	void updateMenuState() {

	}

	void updateGameState() {
		OM.update();
		OM.manageEnemies();
		OM.checkCollision();
		OM.PurgeObjects();
		}
	

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		g.setColor(Color.YELLOW);
		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 20, 100);
		g.setColor(Color.YELLOW);
		g.setFont(textFont);
		g.drawString("Press ENTER to start.", 100, 300);
		g.drawString("Press SPACE for instructions.", 50, 500);
	}

	void drawGameState(Graphics g) {
		g.drawImage(GamePanel.spaceImg, 0, 0, getWidth(), getHeight(), null);
		
		OM.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);
		g.setColor(Color.BLACK);
		g.setFont(EndFont);
		g.drawString("GAME OVER", 50, 100);
		g.setFont(textFont);
		g.drawString("You killed " + OM.getScore() + " enemies.", 100, 300);
		g.drawString("Press ENTER to restart.", 95, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();

		repaint();

		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Rocket.y = Rocket.y - 10;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Rocket.y = Rocket.y + 10;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Rocket.x = Rocket.x - 10;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Rocket.x = Rocket.x + 10;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			OM.addProjectile(new Projectile(Rocket.x + Rocket.width / 2 - 5, Rocket.y, 10, 10));
		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			
			
			if (currentState == MENU_STATE) {
				resetGame();
				currentState = currentState + 1;

			}

			else if (currentState == GAME_STATE) {

				currentState = currentState + 1;

			} else if (currentState == END_STATE) {

				currentState = MENU_STATE;

			}
			
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
void resetGame() {
	
		Rocket = new Rocketship(250, 700, 50, 50);
		OM = new ObjectManager(Rocket, this);

	}

}
