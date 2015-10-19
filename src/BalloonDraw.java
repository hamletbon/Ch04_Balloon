/**
 * This drawing program helps create pictures with several
 * balloons (colored disks or other shapes)
 * Authors: Maria Litvin and Gary Litvin
 */

import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class BalloonDraw extends JFrame
{
	static int width=400; //default window width
	static int height=400; //default window height
 
  public BalloonDraw()  // constructor
  {
    super("Drawing Editor");

    DrawingPanel canvas = new DrawingPanel();
    ControlPanel controls = new ControlPanel(canvas);
    Container c = getContentPane();
    canvas.addRandomBalloon(width, height);
    canvas.addRandomBalloon(width, height);
    canvas.addRandomBalloon(width, height);
    canvas.addRandomBalloon(width, height);
    canvas.addRandomBalloon(width, height);
    c.add(canvas, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
    
  }

  public static void main(String[] args)
  {
    BalloonDraw window = new BalloonDraw();
    window.setBounds(100, 100, width, height);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
