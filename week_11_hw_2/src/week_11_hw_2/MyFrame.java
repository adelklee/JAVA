package week_11_hw_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j = new JLabel("Love Jave");
		j.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				j.setText("Love Java");
			}
			public void mouseEntered(MouseEvent e) {
				j.setText("�����");
			}
		});
		c.add(j);
		
		setSize(300,300);
		setVisible(true);
	}
}
