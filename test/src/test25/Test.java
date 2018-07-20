package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mariadb://localhost:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd); 
			Statement stmt = con.createStatement();
			String sql = "select * from user_info where uNum=2";
			ResultSet rs = stmt.executeQuery(sql);
		   while(rs.next()) {
			System.out.println(rs.getInt("uNum")+ rs.getString("uName")+rs.getString("uAddress")+rs.getString("uEtc"));
		   }
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
          catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
