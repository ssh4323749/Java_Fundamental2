package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		
		try {
			
		
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver Load Success...");
	}catch  (ClassNotFoundException e) {
		System.out.println("Drive Load Fail....");
	}
		
		Connection con= null;
		PreparedStatement pstmt = null;
	
			try {
				con= DriverManager.getConnection("jdbc:mariadb://localhost:3306/kic?autoReconnect=true","kic12","kic12");
				StringBuffer sql = new StringBuffer();
				sql.append("insert into member(num, name, addr)");
				sql.append("Values(?,?,?)");
				
				pstmt = con.prepareStatement(sql.toString());
				pstmt.setInt(1, 12);
				pstmt.setString(2, "변태형");
				pstmt.setString(3,  "똥싸내");
				
				
				//sql전송
				//executeUpdate() => insert, update, delete문일 때 사용
				//반환값은 갱신 되는 행의 수이다.
				int resultCount = pstmt.executeUpdate();
				
				
				System.out.println("갱신된 행의수 : "+resultCount);
				
				//System.out.println("Connection succes");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
					
		}
	
	
}
