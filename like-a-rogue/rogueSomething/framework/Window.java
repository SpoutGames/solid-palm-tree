package framework;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel
{
//some serial shit
	private static final long serialVersionUID = 1L;
	
	//variable initialize
		private JFrame frame;
		private Canvas cnvs;
		
	
	//constructor to be called when creating the window
	
		public JFrame makeWindow(int width, int height, String title)
		{
			frame = new JFrame(title);
			
			frame.setSize(width, height);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setVisible(true);
			frame.createBufferStrategy(2);
			
			cnvs = new Canvas();
			cnvs.setPreferredSize(new Dimension(width, height));
			cnvs.setMaximumSize(new Dimension(width, height));
			cnvs.setMinimumSize(new Dimension(width, height));
			cnvs.setSize(getPreferredSize());
					
			
			frame.add(cnvs);
			frame.pack();
			
			return frame;
		}


		public Canvas getCanvas() {
			return cnvs;
		}

		
		
}
