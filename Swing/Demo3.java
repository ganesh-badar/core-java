package Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Demo extends JFrame{
	
	

	Demo(){
		
		JFrame j = new JFrame();
		
		JLabel l = new JLabel("HELLO....");
		add(l);
		JLabel l1 = new JLabel("WelCome To Swing Demo ");
		add(l1);
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		j.getContentPane().setBackground(Color.green);
		
	}
	
   }


public class Demo3 {

	public static void main(String[] args) {
		Demo d = new Demo();

	}

}
