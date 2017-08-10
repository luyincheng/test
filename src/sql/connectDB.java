package sql;
import java.sql.Connection;  
import java.sql.DriverManager;
public class connectDB {
	 public static final String url = "jdbc:mysql://localhost:3306/jsbq?useUnicode=true&characterEncoding=UTF-8";  
	    public static final String name = "com.mysql.jdbc.Driver";  
	    public static final String user = "root";  
	    public static final String password = "";  
	  
	   /* public Connection conn = null;  
	    public PreparedStatement pst = null;  */
	  
	    public Connection getconnect() {  
	    	 Connection conn=null;
	        try {  
	            Class.forName(name);//指定连接类型  
	             conn = DriverManager.getConnection(url, user, password);//获取连接  
	            return conn;
	          //  pst = conn.prepareStatement(sql);//准备执行语句  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } 
	        return conn;
	    }  
	  
	   /* public void close() {  
	        try {  
	            this.conn.close();  
	            this.pst.close();  
	        } catch (SQLException e) {  
	            e.printStackTrace();  
	        }  
	    }*/  
}
