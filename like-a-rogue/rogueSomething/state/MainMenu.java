package state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

import Gfx.Assets;
import framework.Handler;
import framework.Main;

public class MainMenu extends State{
	
	Main game = new Main();
	
	//privates
		private boolean rowToggleLock = false, displayDevelopment = false;
		private int row = 0, selection = 0, cursorFix = 0;
	
	//publics
	
	//objects
		JLabel label;
		
		
		
	//constructor
		public MainMenu(Handler handler) {
			super(handler);
			label = new JLabel();
		}
	
	//functions
		public void menuSelection() {
			
			//main screen selections
				if (selection == 0) {
						if (row == 0) {			//singlePlayer
							
							cursorFix = 50;
							
							//selection
								if (handler.getInput().enter) {
									
								}
							
						} else if (row == 1) {	//multiplayer
							
							cursorFix = 50;
							
							//selection
								if (handler.getInput().enter) {
									displayDevelopment = true;
								}
							
						} else if (row == 2) {	//options
							
							cursorFix = 30;
							
							//selection
								if (handler.getInput().enter) {
									
								}
							
						} else if (row == 3) { 	//exit
							
							cursorFix = 10;
							//selection
								if (handler.getInput().enter) {
									System.exit(0);
								}
						}
				}
			
			
			//cursor movement
				if (handler.getInput().up || handler.getInput().left) {
					if (!rowToggleLock) {
						if (row - 1 >= 0) {
							row -= 1;
							displayDevelopment = false;
						}
					}
					rowToggleLock = true;
				}
				
				if (handler.getInput().down || handler.getInput().right) {
					if (!rowToggleLock) {
						if (row + 1 <= 3) {
							row += 1;
							displayDevelopment = false;
						}
					}
					rowToggleLock = true;
				}
				
				
			//lock reset
				if (!handler.getInput().down && !handler.getInput().up && !handler.getInput().left && !handler.getInput().right) {
					rowToggleLock = false;
				}
		}
		public void menuText() {
			
		}

		public void tick() {
			//main Main menu code
				menuSelection();		
			
			//hard code to switch to testing area
				if (handler.getInput().backSpace) {
					State.setState(handler.getMain().test);
				}
		}
	
		public void render(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, (int)handler.getWidth(), (int)handler.getHeight());
			
			g.setColor(Color.WHITE);
			g.setFont(new Font("serif", Font.BOLD, 40));
			g.drawString("BlackROGUE", (int) (handler.getWidth()/2-150), 50);
			
			
			//selections
				if (selection == 0) {	//Singleplayer
					g.setColor(Color.WHITE);
					g.setFont(new Font("serif", Font.PLAIN, 20));
					g.drawImage(Assets.mainMenuCursor, 0+cursorFix+150*row, (int) (handler.getHeight()-50), null);
					g.drawString("SinglePlayer", (int)(0+10), (int)handler.getHeight()-20);
					g.drawString("Multiplayer", (int)(0+10+150), (int)handler.getHeight()-20);
					g.drawString("Options", (int)(0+10+150*2), (int)handler.getHeight()-20);
					g.drawString("Exit", (int)(0+10+150*3), (int)handler.getHeight()-20);
				}
				if (selection == 1) {	//Multiplier
					
				}
				if (selection == 2) {	//Options
					
				}
			
			//In development message
				if (displayDevelopment) {
					g.setFont(new Font("serif", Font.PLAIN, 15));
					g.drawString("In Development", 0+10+150, (int) (handler.getHeight()-60));
				}
		}

}
