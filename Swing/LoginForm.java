package Swing;

import java.awt.event.*;
import javax.swing.*;

class Demologin extends JFrame implements ActionListener {

    JTextField username;
    JPasswordField password;
    JLabel Label_username, Label_password, message, title;
    JButton btn, Reset_btn;

    Demologin() {

        setVisible(true);
        setLayout(null);
        setSize(800, 400);

        title = new JLabel("Login Form");
        title.setBounds(320, 50, 200, 40);
        add(title);

        Label_username = new JLabel("Username:");
        Label_username.setBounds(200, 120, 100, 40);
        add(Label_username);

        username = new JTextField();
        username.setBounds(300, 120, 200, 40);
        add(username);

        Label_password = new JLabel("Password:");
        Label_password.setBounds(200, 180, 100, 40);
        add(Label_password);

        password = new JPasswordField();
        password.setBounds(300, 180, 200, 40);
        add(password);

        btn = new JButton("Sign In");
        btn.setBounds(300, 240, 100, 40);
        add(btn);
        btn.addActionListener(this);

        Reset_btn = new JButton("Reset");
        Reset_btn.setBounds(420, 240, 100, 40);
        add(Reset_btn);
        Reset_btn.addActionListener(this);

        message = new JLabel("");
        message.setBounds(300, 290, 300, 40);
        add(message);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            String msg = "Welcome " + username.getText();
            message.setText(msg);
        }

        if (e.getSource() == Reset_btn) {
            username.setText("");
            password.setText("");
            message.setText("");
        }
    }
}

public class LoginForm {
    public static void main(String[] args) {
        new Demologin();
    }
}
