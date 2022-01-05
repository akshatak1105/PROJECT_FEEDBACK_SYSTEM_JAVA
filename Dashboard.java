package feedback.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
	JMenuBar mb;
	JMenu m1,m2;
	JMenuItem w1,w3;
	
	Dashboard(){
		mb= new JMenuBar();
		mb.setBackground(Color.YELLOW);
		add(mb);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/feedback.jpg"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(0,0,800,400);
		add(l1);

		m1= new JMenu("Feedback");
		m1.setBackground(Color.WHITE);
		mb.add(m1);
		
		w1=new JMenuItem("Add");
		w1.addActionListener(this);
		m1.add(w1);
		
//		i2=new JMenuItem("Search");
//		m1.add(i2);
		
		w3=new JMenuItem("Display");
		w3.addActionListener(this);
		m1.add(w3); 
		
		mb.setBounds(0,0,900,30);
		setLayout(null);
		setBounds(380,200,768,432);
		setVisible(true);
		
//		JLabel l2=new JLabel("Course Project Feedback System");
//		l2.setBounds(50, 50, 1000, 90);
//		l2.setForeground(Color.WHITE);
//		l2.setFont(new Font("serif", Font.PLAIN,50));
//        l1.add(l2);
//        
//        JLabel l3=new JLabel("Choose from Menu Bar");
//		l3.setBounds(50, 150, 1800, 90);
//		l3.setForeground(Color.YELLOW);
//		l3.setFont(new Font("serif", Font.PLAIN,30));
//        l1.add(l3);
//        
//        JLabel l4=new JLabel("You can Add or Check Feedbacks");
//		l4.setBounds(50, 200, 1800, 90);
//		l4.setForeground(Color.YELLOW);
//		l4.setFont(new Font("serif", Font.PLAIN,25));
//        l1.add(l4);
				
	}
		public void actionPerformed(ActionEvent ae) {
			if(ae.getActionCommand().equals("Add")) {
				new Add().setVisible(true);
				setVisible(false);
			}
			else if(ae.getActionCommand().equals("Display")) {
				try {
					new Details().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				setVisible(false);
			}
			
		}
	public static void main(String[] args) {
		new Dashboard().setVisible(true);
	}
	
}
