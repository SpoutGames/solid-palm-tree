package framework;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JLabel;

import state.State;

@SuppressWarnings("serial")
public class Window extends JFrame
{
	//privates
		private boolean drawToMainMenu = false;
		
		
	//objects
		private Main main;
		private JFrame frame;
		private Canvas cnvs;
	
	public Window(Main main) {
		this.main = main;
	}
		
	//functions
		
		public JFrame makeWindow(int width, int height, String title)
		{
			frame = new JFrame(title);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setSize(width, height);
			frame.setLocationRelativeTo(null);
			
			
			cnvs = new Canvas();
			cnvs.setPreferredSize(new Dimension(width, height));
			cnvs.setMaximumSize(new Dimension(width, height));
			cnvs.setMinimumSize(new Dimension(width, height));
			cnvs.setFocusable(false);
			cnvs.setSize(getPreferredSize());
					
			if (drawToMainMenu) {
				getDefaultFont();
			}
			
			
			frame.add(cnvs);
			frame.pack();
			frame.setVisible(true);
			
			return frame;
		}

	
		public void tick() {
			if (State.getState() == main.mainMenu) {
				drawToMainMenu = true;
			}
		}
		
	//getters and setters
		public void getDefaultFont() {
			System.exit(0);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.getAllFonts();
			
			Font font = new Font("Arial", Font.PLAIN, 20);
			
			JLabel text = new JLabel("test");
			text.setFont(font);		
			
			getContentPane().add(text);
		}
		
		public Canvas getCanvas() {
			return cnvs;
		}
		public JFrame getJFrame() {
			return frame;
		}
		
}
