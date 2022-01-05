package feedback.system;

import java.sql.*;

public class Conn {
		Connection c;
		Statement s;
		
		public Conn() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				c=DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","@kshata1105.02");
				s=c.createStatement();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
