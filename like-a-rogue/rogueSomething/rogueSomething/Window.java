package rogueSomething;

import javax.swing.JFrame;

public class Window
{
	public JFrame makeWindow(int width, int height, String t)
	{
		JFrame window = new JFrame(t);
		
		window.setSize(width, height);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
		Board board = new Board();
		window.add(board);
		window.addKeyListener(board);
		return window;
	}
}
