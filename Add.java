package feedback.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Add extends JFrame implements ActionListener{
	JTextField div;
    JTextField bat;
    JTextField grp;
    JTextField pres_skills;
    JTextField top;
    JTextField knowl;
    JTextField implement;
    JTextField team_work;
    JTextField tot;
    JTextField fac;
    JButton b1;
    
    JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
    
	Add(){
//		JFrame frame = new JFrame();
//		frame.setBounds(100, 100, 1048, 470);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		
		JLabel head = new JLabel("Feedback System on Course Project");
		head.setFont(new Font("Tahoma", Font.BOLD, 30));
        head.setBounds(249, 10, 578, 55);
        add(head);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(26, 75, 388, 268);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel faculty = new JLabel("Faculty Name");
        faculty.setFont(new Font("Tahoma", Font.BOLD, 13));
        faculty.setBounds(10, 31, 104, 20);
		panel.add(faculty);
		
        fac = new JTextField();
        fac.setColumns(10);
        fac.setBounds(154, 33, 196, 19);
        panel.add(fac);
        
        JLabel division = new JLabel("Division");
        division.setFont(new Font("Tahoma", Font.BOLD, 13));
        division.setBounds(10, 77, 84, 20);
        panel.add(division);
        
        div = new JTextField();
        div.setBounds(154, 79, 196, 19);
        panel.add(div);
        div.setColumns(10);
        
        JLabel batch = new JLabel("Batch ");
        batch.setFont(new Font("Tahoma", Font.BOLD, 13));
        batch.setBounds(10, 129, 84, 20);
        panel.add(batch);
        
        bat = new JTextField();
        bat.setColumns(10);
        bat.setBounds(154, 131, 196, 19);
        panel.add(bat);
        
        JLabel Group = new JLabel("Group");
        Group.setFont(new Font("Tahoma", Font.BOLD, 13));
        Group.setBounds(10, 175, 84, 20);
        panel.add(Group);
        
        grp = new JTextField();
        grp.setColumns(10);
        grp.setBounds(154, 177, 196, 19);
        panel.add(grp);
        
        JLabel subject= new JLabel("subject");
        subject.setFont(new Font("Tahoma", Font.BOLD, 13));
        subject.setBounds(10, 217, 84, 20);
        panel.add(subject);
        
        pres_skills = new JTextField();
        pres_skills.setColumns(10);
        pres_skills.setBounds(154, 219, 196, 19);
        panel.add( pres_skills);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Feedback", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel_1.setBounds(471, 70, 553, 274);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel know = new JLabel("Knowledge of Technology");
        know.setFont(new Font("Tahoma", Font.BOLD, 12));
//        know.setBounds(10, 26, 168, 31);
        know.setBounds(10, 79, 168, 31);
        panel_1.add(know);
        
//       r1=new JRadioButton("Good");
//       r1.setFont(new Font("Tahoma",Font.PLAIN,14));
//       r1.setBounds(188,33,168,49);
//       add(r1);
        knowl = new JTextField();
        knowl.setBounds(188, 33, 332, 19);
        panel_1.add(knowl);
        knowl.setColumns(10);
        
        JLabel skills = new JLabel("Topic");
        skills.setFont(new Font("Tahoma", Font.BOLD, 12));
        skills.setBounds(10, 26, 168, 31);
        panel_1.add(skills);
        
        r1=new JRadioButton("Poor");
        r1.setFont(new Font("Tahoma",Font.PLAIN,14));
        r1.setBounds(188,86,70,19);
        panel_1.add(r1);
        
        r2=new JRadioButton("Average");
        r2.setFont(new Font("Tahoma",Font.PLAIN,14));
        r2.setBounds(258,86,90,19);
        panel_1.add(r2);
        
        r3=new JRadioButton("Good");
        r3.setFont(new Font("Tahoma",Font.PLAIN,14));
        r3.setBounds(348,86,100,19);
        panel_1.add(r3);
        
        r4=new JRadioButton("Excellent");
        r4.setFont(new Font("Tahoma",Font.PLAIN,14));
        r4.setBounds(448,86,100,19);
        panel_1.add(r4);
        
//        top = new JTextField();
//        top.setColumns(10);
//        top.setBounds(188, 86, 332, 19);
//        panel_1.add(top);

        JLabel lblNewLabel_2_2 = new JLabel("Implementation");
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_2.setBounds(10, 120, 168, 31);
        panel_1.add(lblNewLabel_2_2);
        
//        implement = new JTextField();
//        implement.setColumns(10);
//        implement.setBounds(188, 127, 332, 19);
//        panel_1.add(implement);
        
        r5=new JRadioButton("Poor");
        r5.setFont(new Font("Tahoma",Font.PLAIN,14));
        r5.setBounds(188,127,70,19);
        panel_1.add(r5);
        
        r6=new JRadioButton("Average");
        r6.setFont(new Font("Tahoma",Font.PLAIN,14));
        r6.setBounds(258,127,90,19);
        panel_1.add(r6);
        
        r7=new JRadioButton("Good");
        r7.setFont(new Font("Tahoma",Font.PLAIN,14));
        r7.setBounds(348,127,100,19);
        panel_1.add(r7);
        
        r8=new JRadioButton("Excellent");
        r8.setFont(new Font("Tahoma",Font.PLAIN,14));
        r8.setBounds(448,127,100,19);
        panel_1.add(r8);
        
        JLabel lblNewLabel_2_3 = new JLabel("Team Work");
        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_3.setBounds(10, 170, 168, 31);
        panel_1.add(lblNewLabel_2_3);
        
//         team_work = new JTextField();
//        team_work.setColumns(10);
//        team_work.setBounds(188, 177, 332, 19);
//        panel_1.add(team_work);
        
        r9=new JRadioButton("Poor");
        r9.setFont(new Font("Tahoma",Font.PLAIN,14));
        r9.setBounds(188,177,70,19);
        panel_1.add(r9);
        
        r10=new JRadioButton("Average");
        r10.setFont(new Font("Tahoma",Font.PLAIN,14));
        r10.setBounds(258,177,90,19);
        panel_1.add(r10);
        
        r11=new JRadioButton("Good");
        r11.setFont(new Font("Tahoma",Font.PLAIN,14));
        r11.setBounds(348,177,100,19);
        panel_1.add(r11);
        
        r12=new JRadioButton("Excellent");
        r12.setFont(new Font("Tahoma",Font.PLAIN,14));
        r12.setBounds(448,177,100,19);
        panel_1.add(r12);

        JLabel lblNewLabel_2_4 = new JLabel("Total Marks");
        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2_4.setBounds(10, 225, 168, 31);
        panel_1.add(lblNewLabel_2_4);
        
        tot = new JTextField();
        tot.setColumns(10);
        tot.setBounds(188, 232, 332, 19);
        panel_1.add(tot);
        
        b1= new JButton("Save");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(400, 384, 103, 26);
        getContentPane().add(b1);
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b1.addActionListener(this);
        
        JButton btnExit = new JButton("Back");
        btnExit.setBounds(550, 384, 103, 26);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        getContentPane().add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Dashboard().setVisible(true);
                                setVisible(false);
			}
		});
		
        setLayout(null);
        setBounds(300, 100, 1048, 470);
        setVisible(true);
	}
	
//	public void actionPerfomed(ActionEvent ae) {
//		String faculty = fac.getText();
//        String division = div.getText();
//        String batch = bat.getText();
//        String group = grp.getText();
//        String topic = top.getText();
//        String knowledge = knowl.getText();
//        String presentation = pres_skills.getText();
//        String implementation = implement.getText();
//        String teamwork = team_work.getText();
//        String total = tot.getText();
//        
//        Conn c=new Conn();
//        String str="insert into details values('" + faculty + "','" + division + "','" + batch +"','" + group + "','"+topic + "','" + knowledge + "','" + presentation + "','" + implementation + "','" + teamwork + "',' "+ total +"')";
//        try {
//			c.s.executeUpdate(str);
//			JOptionPane.showMessageDialog(null,"Feedback Saved Successfully"); 
//			this.setVisible(false);
//		}catch(Exception e) {
//			
//		}
//	}
	
    public static void main(String[] args) {
		new Add().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String faculty = fac.getText();
        String division = div.getText();
        String batch = bat.getText();
        String group = grp.getText();
        String Subject = pres_skills.getText();
        String knowledge = knowl.getText();
        String topic = null;
        if(r1.isSelected()) {
        	topic="Poor";
        }else if(r2.isSelected()) {
        	topic="Average";
        }else if(r3.isSelected()) {
        	topic="Good";
        }else if(r4.isSelected()) {
        	topic="Excellent";
        }
        String implementation = null;
        if(r5.isSelected()) {
        	topic="Poor";
        }else if(r6.isSelected()) {
        	topic="Average";
        }else if(r7.isSelected()) {
        	topic="Good";
        }else if(r8.isSelected()) {
        	topic="Excellent";
        }
        String teamwork = null;
        if(r9.isSelected()) {
        	topic="Poor";
        }else if(r10.isSelected()) {
        	topic="Average";
        }else if(r11.isSelected()) {
        	topic="Good";
        }else if(r12.isSelected()) {
        	topic="Excellent";
        }
        String total = tot.getText();
        
        Conn c=new Conn();
        String str="insert into details values('" + faculty + "','" + division + "','" + batch +"','" + group + "','"+Subject + "','" + knowledge + "','" + topic + "','" + implementation + "','" + teamwork + "',' "+ total +"')";
        try {
			c.s.executeUpdate(str);
			JOptionPane.showMessageDialog(null,"Feedback Saved Successfully"); 
			this.setVisible(true);
		}catch(Exception ae) {
			
		}
		
	}
}
