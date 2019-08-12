package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeletedateDemo {
	public static void main(String[] args) {

		// 1. 드라이버로드
		try {
			Class.forName("org.mariadb.jtbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kic?autoReconnect=true", "kic12", "kic12");

			StringBuffer sql = new StringBuffer();
			sql.append("delete from member where num = ?");
			

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 12);

			int resultCount = pstmt.executeUpdate();
			System.out.println("삭제된 행의 수 :" + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {

				/*
				 *
				 * 2. Connection 객체생성 3. PrepatedStatment객체생성 4.executeUPdate() 메서드로 sql(insert,
				 * update, delete문 전송
				 */
			}
		}
	}
}