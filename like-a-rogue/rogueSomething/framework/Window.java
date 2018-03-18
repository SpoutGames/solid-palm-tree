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
					
			
			frame.add(cnvs);
			frame.pack();
			frame.setVisible(true);
			
			return frame;
		}


		public Canvas getCanvas() {
			return cnvs;
		}
		public JFrame getJFrame() {
			return frame;
		}

		
		
}
