package rogueSomething;

import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Scanner;
import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("unused")
public class Potato extends JPanel implements KeyListener
{
	private static final long serialVersionUID = -4136842298678816759L;
	//private static Graphics g;
	private static String say = "fuck you";
	static ImageIcon icon = new ImageIcon("C:\\Users\\Caelan\\Pictures\\display_this_in_the_window.png");
	static JLabel imageLabel = new JLabel(icon);
	public static int x = 20, y = 20, bx = 10, by = 10;
	public static void main(String[] args)
	{
		JPanel panel = new JPanel();
		
//		JPanel rectangle = new JPanel();
		JLabel text = new JLabel("fuck you");
		JFrame window = new JFrame("Title");
		Canvas canvas = new Canvas();
		//panel.setSize(50, 50);
		//panel.setEnabled(true);
		
		//window.add(panel);
		
		//Graphics rect = null;
		
		
		//Graphics2D rectangle = (Graphics2D) rect;
		//canvas.paint(rectangle);
		
		window.setVisible(true);
		window.setSize(800,800);
//		window.add(text);
		//window.add(canvas);
		//window.add(potato);
		Potato potato = new Potato();
		window.add(potato);
		
		imageLabel.setBounds(bx, by, x, y);
		//window.add(new JLabel(new ImageIcon("C:\\Users\\Caelan\\Pictures\\display_this_in_the_window.png")));
		window.add(imageLabel);
		window.addKeyListener(potato);

		
	}
	/*
	public void paint(Graphics g)
	{
		Graphics2D rectangle = (Graphics2D) g;
		rectangle.setColor(Color.ORANGE);
		rectangle.drawRect(10, 10, 100, 100);
		rectangle.fillRect(10, 10, 100, 100);
//		rectangle.draw(new Ellipse2D.Double(0, 100, 30, 30));
		
	}
	*/
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			imageLabel.setLocation(x - 1, y);
			x --;
		}
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			imageLabel.setLocation(x + 1, y);
			x ++;
		}
		/*
		System.out.println("hi");
		imageLabel.setLocation(x + 1, y + 1);
		x ++;
		y ++;
		*/
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) 
	{
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) 
	{
		//System.out.println("hi");
		
	}
}

