package main;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class testSql {
	public static final String url = "jdbc:mysql://121.40.196.120:3306/zyy";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "iamhad00p";  
	public static void main(String[] args){
	    Connection conn = null;  
	     PreparedStatement pst = null;  
	     try {
			Class.forName(name);
			System.out.println("driver success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//指定连接类型  
         try {
			conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("connect success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//获取连接  
	}
}
