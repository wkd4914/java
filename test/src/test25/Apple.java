package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Apple {

	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://localhost:3306/apple";
		String id = "root";
		String pwd = "12345678";
		
		
		 try {
			Class.forName("org.mariadb.jdbc.Driver");//1번째 트라이/캐치
			con = DriverManager.getConnection(url, id, pwd);//2번째 캐치
			Statement stmt = con.createStatement();
			String sql = "delete from apple_user where uAge=27";//삭제 구문에서 실행되는 값
			int cnt = stmt.executeUpdate(sql);// 삭제되었을때 갯수
			if(cnt==1) {
				System.out.println("나이가 27인 사람이 한명 삭제 되었네요");
			}else{
				System.out.println("삭제된 사람이 없네요");
			}
			
			sql = "select * from apple_user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("uName") + "," + rs.getInt("uAge") + "," + rs.getString("uAddress") + "," + rs.getString("uSex"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
