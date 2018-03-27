package state;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JLabel;

import Gfx.Assets;
import framework.Handler;
import framework.Main;

public class MainMenu extends State{
	
	Main game = new Main();
	
	//privates
		private boolean rowToggleLock = false, displayDevelopment = false;
		private int row = 0, selection = 0;
		private Font defaultFont = new Font("serif", Font.BOLD, 40);
		private String cursorFix;
	
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
							
							cursorFix = "Singleplayer";
							
							//selection
							if (!rowToggleLock) {
								if (handler.getInput().enter) {
									selection = 1;
									rowToggleLock = true;
									row = 0;
								}
							}
						} 
						
						else if (row == 1) {	//multiplayer
							
							cursorFix = "Multiplayer";
							
							//selection
							if (!rowToggleLock) {
								if (handler.getInput().enter) {
									displayDevelopment = true;
								}
							}
							
						} 
							
						else if (row == 2) {	//options
							
							cursorFix = "Options";
							
							//selection
							if (!rowToggleLock) {
								if (handler.getInput().enter) {
									
								}
							}
							
						} 
						
						else if (row == 3) { 	//exit
							
							cursorFix = "Exit";
							//selection
								if (handler.getInput().enter) {
									System.exit(0);
								}
						}
				}
				
				
				if (selection == 1) {
					if (row == 0) {
						
					} else if (row == 1) {
						
					} else if (row == 2) {
						if (!rowToggleLock) {
							if (handler.getInput().enter) {
								selection = 0;
								rowToggleLock = true;
								row = 0;
							}
						}
					}
				}
			
			//cursor movement
				if (selection == 0) {
					if (handler.getInput().up || handler.getInput().left) {
						if (!rowToggleLock) {
							if (row - 1 >= 0) {
								row -= 1;
								rowToggleLock = true;
								displayDevelopment = false;
							}
						}
					}
					
					if (handler.getInput().down || handler.getInput().right) {
						if (!rowToggleLock) {
							if (row + 1 <= 3) {
								row += 1;
								rowToggleLock = true;
								displayDevelopment = false;
							}
						}
					}
				} else if (selection == 1) {
					if (handler.getInput().up) {
						if (!rowToggleLock) {
							if (row - 1 >= 0) {
								row -= 1;
								rowToggleLock = true;
							}
						}
					}
					if (handler.getInput().down) {
						if (row + 1 <= 2) {
							row += 1;
							rowToggleLock = true;
						}
					}
				}
				
			//lock reset
				if (!handler.getInput().down && !handler.getInput().up && !handler.getInput().left && !handler.getInput().right && !handler.getInput().enter) {
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
			FontMetrics metrics = g.getFontMetrics(defaultFont);
			g.setFont(defaultFont);
			g.drawString("BlackROGUE", (int) (handler.getWidth() - metrics.stringWidth("BlackROGUE"))/2, 50);
			
			
			//selections
				if (selection == 0) {	//main screen
					g.setColor(Color.WHITE);
					g.setFont(new Font("serif", Font.PLAIN, 25));
					g.drawImage(Assets.mainMenuCursor, 0+metrics.stringWidth(cursorFix)/3+200*row, (int) (handler.getHeight()-60), null);
					g.drawString("Singleplayer", (int)(0+10), (int)handler.getHeight()-20);
					g.drawString("Multiplayer", (int)(0+10+200), (int)handler.getHeight()-20);
					g.drawString("Options", (int)(0+10+200*2), (int)handler.getHeight()-20);
					g.drawString("Exit", (int)(0+10+200*3), (int)handler.getHeight()-20);
				}
				if (selection == 1) {	//Singleplayer
					g.setColor(Color.WHITE);
					g.setFont(new Font("serif", Font.PLAIN, 25));
					g.drawString("SinglePlayer", (int)(20), (int)handler.getHeight()-250);
					g.setFont(new Font("serif", Font.PLAIN, 20));
					g.drawString("New Game", (int)(30), (int)(handler.getHeight()-200));
					g.drawString("Load Game", (int)(30), (int)(handler.getHeight()-160));
					g.drawString("Back", (int)(30), (int)(handler.getHeight()-120));
				}
				if (selection == 2) {	//Multiplayer
					
				}
				if (selection == 3) { 	//options
					
				}
			
			//In development message
				if (displayDevelopment) {
					g.setFont(new Font("serif", Font.PLAIN, 15));
					g.drawString("In Development", 0+10+150, (int) (handler.getHeight()-60));
				}
		}

}
