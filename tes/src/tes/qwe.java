package tes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class qwe {

	public static final String DBDRIVER = "org.gjt.mm.mysql.long" ;
	public static final String DBURL = "jdbc:mysql://localhost:3306/long" ;
    	public static void main(String[] args)
    	{
    	String user = "root";
    	String password = "root";
    	String url = "jdbc:mysql://localhost:3306/long"; 
    	//jdbc:mysql://localhost:3306/数据库名字?characterEncoding=GBK
    	String sql = "SELECT * FROM Student";
    	System.out.println("Now!");
    	try
    	{
    		System.out.println("1");
    	Connection con = DriverManager.getConnection(url, user, password);
    	System.out.println("2");
    	Statement stam = con.createStatement();
    	ResultSet rs = stam.executeQuery(sql);
    	 String job = null;
         String id = null;
         String a = null;
        while(rs.next()){
                       //获取stuname这列数据
        	         id=rs.getString("id");
                     job = rs.getString("name");
                     a=rs.getString("age");
        	               //获取stuid这列数据 
        	
        	               //输出结果
        	               System.out.println(id + "\t" + job+"\t"+a);
        	           }
    	}
    	
    	catch(Exception e)
    	{
    	System.out.println("Failed : "+e.toString());
    	}
}}
