package Swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame1 extends JFrame{
	JButton b1,b2,b3,b4;
	JTextArea t;
	
	MyFrame1(){
		BorderLayout b = new BorderLayout();
		b1 = new JButton("East");
		b2= new JButton("west");
		b3= new JButton("North");
		b4= new JButton("South");
		t = new JTextArea();
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.NORTH);
		add(b4,BorderLayout.SOUTH);
		add(t,BorderLayout.CENTER);
		setVisible(true);
		setSize(400,400);
		
	}

	
	
}
public class DemoBorderLayout {

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();
		

	}

}
