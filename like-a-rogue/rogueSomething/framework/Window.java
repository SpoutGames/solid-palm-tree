package framework;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window
{
	//variable initialize
		private JFrame frame;
		private Canvas canvas;
	
	//constructor to be called when creating the window
	
		public JFrame makeWindow(int width, int height, String title)
		{
			frame = new JFrame(title);
			
			frame.setSize(width, height);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setVisible(true);
			
			canvas = new Canvas();
			canvas.setPreferredSize(new Dimension(width, height));
			canvas.setMaximumSize(new Dimension(width, height));
			canvas.setMinimumSize(new Dimension(width, height));
			canvas.setBackground(Color.MAGENTA);
			
			frame.add(canvas);
			frame.pack();
			
			return frame;
		}

		public Canvas getCanvas() {
			return canvas;
		}
		
		
}
