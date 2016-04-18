package comm.huizi.week7.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	static{
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://127.0.0.1:3306/customer";
		user="root";
		password="root";
	}
	
	public static Connection getConn() throws Exception{
		//1.加载驱动
		Class.forName(driver);
		//2.获取链接
		return DriverManager.getConnection(url, user, password);
		//3创建pstmt
		//4.执行SQL语句
		//5.如有结果集。处理结果集
		//6.释放资源
	}
	public static void close(ResultSet rs,PreparedStatement pstmt,Connection conn) throws SQLException{
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(conn!=null)
			conn.close();
	}

}
