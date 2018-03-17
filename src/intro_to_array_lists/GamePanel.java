package intro_to_array_lists;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer timer;
final int MENU_STATE = 0;

final int GAME_STATE = 1;

final int END_STATE = 2;

int currentState = MENU_STATE;

GamePanel(){
	timer = new Timer(1000/60, this);

}
void StartGame() {
    timer.start();


}  @Override

public void paintComponent(Graphics g){
	//g.fillRect(10, 10, 100, 100);
	

                

        }

void updateMenuState(){
	
}
void updateGameState(){
	
}
void updateEndState(){
	
}
void drawMenuState(Graphics g){
	g.setColor(Color.BLUE);

	g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);    

	
}
void drawGameState(Graphics g){
	g.setColor(Color.BLACK);

	g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);   
}
void drawEndState(Graphics g){
	g.setColor(Color.RED);

	g.fillRect(0, 0, LeagueInvaders.w, LeagueInvaders.h);   
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 repaint(); 
	 
	 repaint();
	 
	 if(currentState == MENU_STATE){

         updateMenuState();

 }else if(currentState == GAME_STATE){

         updateGameState();

 }else if(currentState == END_STATE){

         updateEndState();

 }
	 
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("hi");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("lhi");
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		
		if(currentState > MENU_STATE){

	        currentState = GAME_STATE;

	}
	if(currentState > GAME_STATE){

        currentState = END_STATE;

}
if(currentState > END_STATE){

        currentState = MENU_STATE;

}
}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("ahi");
	
}
	
}
