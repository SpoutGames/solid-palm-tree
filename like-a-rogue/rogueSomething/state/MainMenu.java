package state;

import java.awt.Color;
import java.awt.Graphics;

import framework.Handler;
import framework.Main;

public class MainMenu extends State{
	
	Main game = new Main();
	
	//constructor
		public MainMenu(Handler handler) {
			super(handler);
		}
	
	//functions
		public void menu() {
			
		}

		public void tick() {
			if (handler.getInput().backSpace) {
				State.setState(handler.getMain().test);
			}
		}
	
		public void render(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, (int)handler.getWidth(), (int)handler.getHeight());
			g.setColor(Color.GRAY);
			g.drawRect((int)handler.getWidth()/3,(int)handler.getHeight()/2,(int)handler.getWidth()/3,(int)handler.getHeight()/4);
			
		}

}
