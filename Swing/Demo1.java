package Swing;
import java.awt.Color;

import javax.swing.JFrame;


//By Extending Jframe Class

class SDemo extends JFrame{
	SDemo(){
		setVisible(true);
		setSize(400,400);
		setLayout(null);
		setTitle("Swing Frame");
		getContentPane().setBackground(Color.GREEN);
		
		
		
	}
}




public class Demo1 {

	public static void main(String[] args) {
		 SDemo s= new SDemo();
		 

	}

}
