import java.awt.*;
import javax.swing.*;
 
public class test {
 
  public static void main(String[] arguments) 
  {
 
    MyPanel panel = new MyPanel();
 
    // create a basic JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("JFrame Color Example");
    frame.setSize(300,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    // add panel to main frame
    frame.add(panel);
 
    frame.setVisible(true);
 
  }
}
 
// create a panel that you can draw on.
class MyPanel extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 2751990270602769885L;

public void paint(Graphics g) 
{
    g.setColor(Color.red);
    g.fillRect(10,10,100,100);
  }
}
 