package feedback.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements  ActionListener{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	Login(){
		
		l1=new JLabel("Name");
		l1.setBounds(40,20,100,30);
		add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(40,70,100,30);
		add(l2);
		
		t1=new JTextField();
		t1.setBounds(150,20,350,30);
		add(t1);
		
		t2=new JPasswordField();
		t2.setBounds(150,70,350,30);
		add(t2);
		
		b1=new JButton("Login");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(150,150,120,30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Cancel");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(350,150,120,30);
		b2.addActionListener(this);
		add(b2);
		
		setLayout(null);
		setBounds(380,200,600,250);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource()==b1) {
			String username= t1.getText();
			String password= t2.getText();
			Conn c= new Conn();
			
			String str="select * from login where username= '"+username+"' and password= '"+password+"'";
			
			try {
				ResultSet rs=c.s.executeQuery(str);
				if (rs.next()) {
					new Dashboard().setVisible(true);
					this.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"Invalid Credentials");
					this.setVisible(false);
				}
			}catch(Exception e) {
				
			}
			
		}else if(ae.getSource()==b2) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
}
