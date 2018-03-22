package framework;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Gfx.Assets;
import map.TestingRoom;
import player.Input;
import state.State;

public class Main implements Runnable{
	
	//constants
		private final int WIDTH = 320;
		private final int HEIGHT = WIDTH / 16 * 9;
		private final static int SCALE = 3;
		private final static String NAME = "Title: Work in progress.";
		
	//variables
		//privates
			private BufferStrategy bs;
			private Graphics g;
			private static boolean running = false;
			
		//public
			public Thread thread;
		
		//objects
			Window window = new Window();
			Input newInput = new Input();
			Handler handler;
			Camera camera;
			private TestingRoom test;
			
	//start of thread
		public void init() {
			window.makeWindow(WIDTH * SCALE, HEIGHT * SCALE, NAME);
			window.getJFrame().addKeyListener(newInput);
			Assets.init();
			
			handler = new Handler(this);
			camera = new Camera(handler, 0, 0);
			
			
			test = new TestingRoom(handler);
			State.setState(test);
		}
		
		
	
	//ticks and render
		//tick
			public void tick() {
				newInput.tick();
				
				if (State.getState() != null) {
					State.getState().tick();
				}
				
			}
		
		//render
			public void render() {
				bs = window.getCanvas().getBufferStrategy();
				if (bs == null) {
					window.getCanvas().createBufferStrategy(3);
					return;
				}
				
				g = bs.getDrawGraphics();
				//clear screen
					g.clearRect(0, 0, WIDTH*SCALE, HEIGHT*SCALE);
				//draw to screen
				
					if (State.getState() != null) {
						State.getState().render(g);
					}
					
				//Show then reset
					bs.show();
					g.dispose();
			}

	//Main loop
		@Override
		public void run() {
			
			init();
			
			int fps = 60;
			double timePerTick = 1000000000 / fps;
			double delta = 0;
			long now;
			long lastTime = System.nanoTime();
			
			
			while (running) {
				now = System.nanoTime();
				delta += (now - lastTime) / timePerTick;
				lastTime = now;
				
				if (delta >= 1) 
				{
					tick();
					render();
					delta--;
				}
			}
			
			stop();
			
		}	
		
		public Input getInput() {
			return newInput;
		}
		
		
		public Camera getCamera() {
			return camera;
		}
		
		//Start thread
			public synchronized void start() {
				if (running) {
					return;
				}
				running = true;
				thread = new Thread(this); 
				thread.start();
				
			}
		
		//Stop thread
			public synchronized void stop() {
				if (!running) {
					return;
				}
				running = false;
				try {
					thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}		
			
			
		//getters and setters
			public double getWidth() {
				return this.WIDTH * this.SCALE;
			}
			public double getHeight() {
				return this.HEIGHT * this.SCALE;
			}

}