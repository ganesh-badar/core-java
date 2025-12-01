package EventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class RadioDemo extends JFrame implements ActionListener {
    JTextField t;
    JRadioButton r1, r2;
    JCheckBox c1, c2;
    JLabel l;
    JButton b;

    RadioDemo() {
        setLayout(new FlowLayout());

        t = new JTextField(15);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");

        l = new JLabel("Greeting");
        b = new JButton("OK");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);

        b.addActionListener(this);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = t.getText();   // Corrected

        if (r1.isSelected()) {
            name = "Mr. " + name;
        } else if (r2.isSelected()) {
            name = "Ms. " + name;
        }

        if (c1.isSelected()) {
            name = name + " Dancer";
        }
        if (c2.isSelected()) {
            name = name + " Singer";
        }

        l.setText(name);
    }
}

public class UserInput {
    public static void main(String[] args) {
        new RadioDemo();
    }
}
