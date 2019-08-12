package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDao {
	//static {
	
	//}
	
	//1.singleton 코딩
	
	private static MemberDao single;
	private MemberDao()	{
	try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static MemberDao getInstance() {
		if(single == null) {
			single = new MemberDao();
			
		}
		return single;
	}

		//Dto : data Transfer object
	public boolean insert(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		
		int index = 1;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic?autoReconnect=true","kic12","kic12" );
			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num, name, addr)");
			sql.append("values(?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(index++, m.getNum());
			pstmt.setString(index++, m.getName());
			pstmt.setString(index, m.getAddr());
			
			pstmt.executeUpdate();
			isSuccess = true;
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		
		try{if(pstmt != null)  pstmt.close();
		    if(con!=null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
		
		
		
		
		
		
	return isSuccess;

	
	}
	

}