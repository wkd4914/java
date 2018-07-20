package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {

	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://localhost:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		
			try {
				Class.forName("org.mariadb.jdbc.Driver");// 이때 오류가 발생한다 여기서 try catch를 잡아준다 add~~~
				con = DriverManager.getConnection(url, id, pwd); // 2번째 캐치
				Statement stmt = con.createStatement();
				String sql = "delete from user_info where uNum=1";
				int cnt=stmt.executeUpdate(sql);//delete
				if(cnt==1) {//delete
					System.out.println("1번이 삭제가 잘되었네요");
				}else {//delete
					System.out.println("삭제가 안됬다~ 1번이라는거 없는것 같다");
				}
				sql = "insert into user_info(uName, uAge, uAddress, uEtc)";//insert
				sql +=  "values('두방이',1,'부천','아덜')";//insert
			
				cnt = stmt.executeUpdate(sql);
				if(cnt==1) {//insert
					System.out.println("등록이 잘됬네요");
				}else {//insert
					System.out.println("등록 안된듯~");
				}
				
				sql = "update user_info set uEtc='테스트' where uNum=2";
				
				cnt = stmt.executeUpdate(sql);
				if(cnt==1) {
					System.out.println("수정이 잘되었네요");
				}else {
					System.out.println("수정이 안된듯");
				}
				
				sql = "select * from user_info";// 여기서 두번째 캐치(
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getInt("uNum")+ rs.getString("uName")+rs.getString("uAddress")+rs.getString("uEtc"));
				}
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
	}
}