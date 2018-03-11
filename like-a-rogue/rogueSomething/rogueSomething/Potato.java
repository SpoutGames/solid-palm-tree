package rogueSomething;

import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.*;
@SuppressWarnings("unused")
public class Potato 
{
	private static String say = "fuck you";
	public static void main(String[] args)
	{
		JLabel text = new JLabel("fuck you");
		JFrame window = new JFrame("Title");
		window.setVisible(true);
		window.setSize(300,200);
		window.add(text);
		
	}
}
