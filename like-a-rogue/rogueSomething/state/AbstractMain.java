package state;

import framework.Window;

public class AbstractMain implements Runnable{
	
	//variable initialize
		private final static int WIDTH = 320;
		private final static int HEIGHT = WIDTH / 16 * 9;
		private final static int SCALE = 3;
		private final static String NAME = "Title: Work in progress.";
		private static boolean running = false;
		public Thread thread;
	
	
	//start of thread
		public void init() {
			Window window = new Window();
			window.makeWindow(WIDTH * SCALE, HEIGHT * SCALE, NAME);
		}
	
	//ticks and frame
		//tick
			public void tick() {
				
			}
		
		//frame
			public void frame() {
				
			}
		
		
		
	//Main loop
		@Override
		public void run() {
			
			init();
			
			while (running) {
				tick();
				frame();
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