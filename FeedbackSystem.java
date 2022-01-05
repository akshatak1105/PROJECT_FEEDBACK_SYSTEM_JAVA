package feedback.system;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeedbackSystem extends JFrame implements ActionListener {
	FeedbackSystem(){
		setBounds(380,200,900,400);
		
//		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/vit.jpg"));
//		JLabel l1=new JLabel(i1);
//		l1.setBounds(0,0,328,154);
//		add(l1);
		
		JLabel l2=new JLabel("Course Project Feedback System");
		l2.setBounds(50, 50, 1000, 90);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("serif", Font.PLAIN,50));
        add(l2);
		
		JButton b1=new JButton("Next");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(100,200,170,40);
		b1.addActionListener(this);
        add(b1);
		
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		new Login().setVisible(true);
		setVisible(false);
        
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FeedbackSystem();

	}
}
