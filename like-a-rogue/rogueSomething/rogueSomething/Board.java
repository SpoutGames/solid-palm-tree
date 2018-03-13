package rogueSomething;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Board extends JPanel {

	private static final long serialVersionUID = 1L;
	
	Main main = new Main();
	int x = main.getX();
	int y = main.getY();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawRectangle(g);
    }
    
    
    
    private void drawRectangle(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        
        Rectangle2D e = new Rectangle2D.Double(x, y, 20, 20);
        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(x, y, 20, 20);
        g2d.draw(e);

    }
}