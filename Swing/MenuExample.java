package Swing;



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Menuframe2 extends JFrame{
	 JMenu menu,SubMenu;
	 JMenuBar MenuBar;
	 JMenuItem i1,i2,i3,i4,i5;
	 
	 Menuframe2 (){
		 JFrame f = new JFrame("Menu Example");
		 menu = new JMenu("Menu");
		 SubMenu = new JMenu("SubMenu");
		 MenuBar = new JMenuBar();
		 
		 i1 = new JMenuItem("C");
		 i2 = new JMenuItem("Java");
		 i3 = new JMenuItem("Python");
		 i4 = new JMenuItem("HTML");
		 i5 = new JMenuItem("CSS");
		 
		 menu.add(i1);
		 menu.add(i2);
		 menu.add(i3);
		 SubMenu.add(i4);
		 SubMenu.add(i5);
		 MenuBar.add(menu);
		 menu.add(SubMenu);
		 f.setJMenuBar(MenuBar);
		 f.setVisible(true);
		 f.setSize(400,400);
		 f.setLayout(null);	 }
 }
public class MenuExample {

	public static void main(String[] args) {
		Menuframe2 f = new Menuframe2();

	}

}
