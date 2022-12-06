import javax.swing.*;
import java.awt.*;
// 9-6
public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); // ¹öÆ° »ý¼º
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b); // ¹öÆ°À» ÄÁÅÙÆ®ÆÒ¿¡ ºÎÂø
		}
		
		setSize(300, 200);
		setVisible(true);
	}
}
