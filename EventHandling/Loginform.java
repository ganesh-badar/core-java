package EventHandling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;

import javax.swing.*;

import com.mysql.cj.protocol.Message;
class Demologin extends JFrame implements ActionListener{
	
	JTextField username;
	JPasswordField password;
	JLabel label_username ,label_password,msg,title;
	JButton btn, reset_btn ;
	
	Demologin(){
		
		setVisible(true);
		setLayout(null);
		setSize(800,400);
		
		title = new JLabel("Login Form");
		title.setBounds(320,50,200,40);
		add(title);
		
		label_username = new JLabel("User Name");
		label_username.setBounds(200, 150, 100, 40);
		add(label_username);
		
		username = new JTextField();
		username.setBounds(300, 150, 300, 40);
		add(username);
		
		label_password = new JLabel("Password");
		label_password.setBounds(200, 200, 100, 40);
		add(label_password);
		
        password = new JPasswordField();
        password.setBounds(300, 200, 300, 40);
		add(password);
		
		btn = new JButton("Sign In");
		btn.setBounds(300, 260, 100, 40);
		add(btn);
		btn.addActionListener(this);
		
		reset_btn = new JButton("cancel");
		reset_btn.setBounds(420, 260, 100, 40);
		add(reset_btn);
		reset_btn.addActionListener(this);
		
		msg = new JLabel("");
		msg.setBounds(350, 320, 200, 40);
		add(msg);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == btn) {
			String massage = "welcome : "+username.getText();
			msg.setText(massage);
		}
		
		if(e.getSource() == reset_btn) {
			username.setText("");
			password.setText("");
		}
		
	}
	
	
	
}


public class Loginform {

	public static void main(String[] args) {
		
		Demologin m = new Demologin();
		
	}

}
