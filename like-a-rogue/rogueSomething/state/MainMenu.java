package state;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

import framework.Handler;
import framework.Main;

public class MainMenu extends State{
	
	Main game = new Main();
	
	//privates
		private boolean rowToggleLock = false;
		private int row = 0, selection = 0;
	
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
			if (row == 0) { //singlePlayer
				
			} else if (row == 1) { //multiplayer
				
			} else if (row == 2) { //options
		
			} else if (row == 3) { //exit
				if (handler.getInput().enter) {
					System.exit(0);
				}
			}
			if (handler.getInput().up) {
				if (!rowToggleLock) {
					if (row - 1 >= 0) {
						row -= 1;
					}
				}
				rowToggleLock = true;
			}
			if (handler.getInput().down) {
				if (!rowToggleLock) {
					if (row + 1 <= 3) {
						row += 1;
					}
				}
				rowToggleLock = true;
			}
			if (!handler.getInput().down && !handler.getInput().up) {
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
			g.setColor(Color.GRAY);
			g.drawRect((int)handler.getWidth()/3,(int)handler.getHeight()/2,(int)handler.getWidth()/3,(int)handler.getHeight()/4);
			
			if (selection == 0) {
				g.setColor(Color.WHITE);
				g.drawString("SinglePlayer", (int)handler.getWidth()/4+80, (int)handler.getHeight()/4*2);
				g.drawString("Multiplayer", (int)handler.getWidth()/4+80, (int)handler.getHeight()/4*2+20);
			}
			
		}

}
