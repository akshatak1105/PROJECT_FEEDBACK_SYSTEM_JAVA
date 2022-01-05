package feedback.system;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import java.sql.*;	
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Details extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JLabel Faculty;
	private JLabel Division;
	private JLabel Batch;
	private JLabel Group;
	private JTable table;
	private JLabel Topic;
	private JLabel Technology_knowledge;
	private JLabel Subject;
	private JLabel Implement;
	private JLabel Team_work;
	private JLabel Total_marks;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Details frame = new Details();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		this.dispose();
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Details() throws SQLException {
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(380, 150, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Dashboard().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(450, 510, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
                                    Conn c  = new Conn();
                                    
				String displayCustomersql = "select * from details";
				ResultSet rs = c.s.executeQuery(displayCustomersql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				
			
		});
		btnLoadData.setBounds(300, 510, 120, 30);
                btnLoadData.setBackground(Color.BLACK);
                btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		Faculty = new JLabel("faculty");
		Faculty.setBounds(31, 11, 46, 14);
		contentPane.add(Faculty);
                
		
		Division = new JLabel("Division");
		Division.setBounds(100, 11, 65, 14);
		contentPane.add(Division);
		
		Batch = new JLabel("Batch");
		Batch.setBounds(200, 11, 46, 14);
		contentPane.add(Batch);
		
		table = new JTable();
		table.setBounds(10, 40, 900, 450);
		contentPane.add(table);
		
		Group = new JLabel("Group");
		Group.setBounds(300, 11, 46, 14);
		contentPane.add(Group);
		
		
		Subject = new JLabel("Subject");
		Subject.setBounds(380, 11, 46, 14);
		contentPane.add(Subject);
		
		Technology_knowledge = new JLabel("Topic");
		Technology_knowledge.setBounds(465, 11, 100, 14);
		contentPane.add(Technology_knowledge);
		
		Topic = new JLabel("Knowledge");
		Topic.setBounds(550, 11, 100, 14);
		contentPane.add(Topic);
                
		Implement = new JLabel("Implement");
		Implement.setBounds(650, 11, 100, 14);
		contentPane.add(Implement);
		
		Team_work = new JLabel("Team Work");
		Team_work.setBounds(750, 11, 100, 14);
		contentPane.add(Team_work);
		
		Total_marks = new JLabel("Total");
		Total_marks.setBounds(850, 11, 100, 14);
		contentPane.add(Total_marks);
                getContentPane().setBackground(Color.WHITE);
	}
}
