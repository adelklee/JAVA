package week_12_hw_2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyFrame extends JFrame {
	private int c=0;
	private JLabel[] la = new JLabel[26];
	private char alpha = 'A';
	
	public MyFrame(){
		this.setTitle("A-Z Program");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		for(int i=0; i<la.length; i++) {
			la[i] = new JLabel(Character.toString(alpha));
			la[i].setText(Character.toString(alpha++));
			la[i].setSize(30, 30);
			la[i].setFont(new Font("Arial", Font.PLAIN, 30));
			int x = (int)(Math.random()*400+20);
			int y = (int)(Math.random()*400+20);
			la[i].setLocation(x, y);
			la[i].addMouseListener(new MyMouseListener());
			this.add(la[i]);
		}
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	class MyMouseListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel a = (JLabel)e.getSource();
			if(la[c]==a) {
				a.setVisible(false);
				c++;
				if(c==26) {
                    Frame f = new Frame("Parent");
                    f.setSize(0,0);
                    
                    final JDialog frame = new JDialog(f, "Information", true);
                    frame.setSize(140,90);
                    frame.setLocation(175, 180);
                    frame.setLayout(new FlowLayout());
                    
                    Label msg = new Label("Exit this program", Label.CENTER);
                    Button ok = new Button("OK");
                    
                    ok.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent arg0) {
                            System.exit(0);
                        }
                    });
                    frame.add(msg);
                    frame.add(ok);
                    f.setVisible(true);
                    frame.setVisible(true);
				}
			}
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			
		}
	}
}

// 26°³

// 26°³