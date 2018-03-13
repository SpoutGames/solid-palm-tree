package rogueSomething;

import java.awt.*;

import javax.swing.*;

public class Main extends Canvas implements Runnable{

	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 320;
	public static final int HEIGHT = WIDTH / 16 * 9;
	public static final int SCALE = 3;
	public static final String NAME = "Game";
	
	public boolean running = false;
	
	private JFrame frame;
	private JLabel text;
	private Graphics2D g;
	
	public paint() {
		g = (Graphics2D) g;
		g.drawRect (0, 0, 20, 20);
		g.setColor(Color.MAGENTA);
		g.fillRect(0, 0, 20, 20);
	}
	
	
	public Main() {
		setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
				
		frame = new JFrame(NAME);
		text = new JLabel(NAME);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		frame.add(this, BorderLayout.CENTER);
		text.setBounds(0,0,WIDTH,HEIGHT);
		frame.add(text);
		frame.add();
		frame.pack();
		
		frame.setResizable(false);
		frame.setSize(getPreferredSize());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public synchronized void start() {
		running = true;
		new Thread(this).start();
	}
	
	
	public synchronized void stop() {
		running = false;
	}
	
	public void run(){
		//while (running){
			//System.out.println("Hello World!");			
		//}
	}
	
	 public static void main(String[] args) {
		new Main().start();
	}
}

