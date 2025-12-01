package EventHandling;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class eventmouse extends MouseAdapter {
  JFrame f;
  eventmouse(){
	  f = new JFrame("mouse_event");
	  f.addMouseListener(this);
	  f.setVisible(true);
	  f.setSize(400,400);
	  f.setLayout(null);
	  
  }
	public static void main(String[] args) {
		eventmouse m = new eventmouse();

	}
	
	public void mouseClicked(MouseEvent e) {
		Graphics g = f.getGraphics();
		g.setColor(Color.green);
		g.fillRect(e.getX(), e.getY(), 20,20);
	}

}
