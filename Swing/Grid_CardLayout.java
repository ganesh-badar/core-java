package Swing;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame{
	JButton b1,b2,b3,b4;
	MyFrame(){
		//FlowLayout f = new FlowLayout(FlowLayout.CENTER);
		//GridLayout g = new GridLayout();
		CardLayout c = new CardLayout();
		b1 = new JButton("One");
		b2 = new JButton("Two");
		b3 = new JButton("Three");
		b4 = new JButton("Four");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setVisible(true);
		setSize(400,400);
		//setLayout(f);
		//setLayout(g);
		setLayout(c);
	}
}


public class Grid_CardLayout {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}

}
