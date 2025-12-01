package EventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Demo extends JFrame implements ActionListener{

	JColorChooser cc;
	JLabel l;
	JButton b;
	Demo(){
		
		cc = new JColorChooser();
		b = new JButton("Pad Color");
		l =new JLabel();
		
		cc.setBounds(10,10,300,300);
		b.setBounds(20,330,100,40);
		
		add(cc);
		add(b);
		add(l);
		
		b.addActionListener(this);
		
		setVisible(true);
		setLayout(null);
		setSize(400,400);
	
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		getContentPane().setBackground(cc.getColor());
		
	}}


public class ColorChoser {
	

	public static void main(String[] args) {
		Demo d = new Demo();
		

	}

}
