package state;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import framework.Window;

public class Main implements Runnable{
	
	//variable initialize
		private final static int WIDTH = 320;
		private final static int HEIGHT = WIDTH / 16 * 9;
		private final static int SCALE = 3;
		private final static String NAME = "Title: Work in progress.";
		private BufferStrategy bs;
		private Graphics g;
		private static boolean running = false;
		public Thread thread;
	
		Window window = new Window();
	
	//start of thread
		public void init() {
			window.makeWindow(WIDTH * SCALE, HEIGHT * SCALE, NAME);
		}
	
	//ticks and render
		//tick
			public void tick() {
				
			}
		
		//render
			public void render() {
				bs = window.getCanvas().getBufferStrategy();
				if (bs == null) {
					window.getCanvas().createBufferStrategy(2);
					return;
				}
				g = bs.getDrawGraphics();
				
				
				
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
		

}