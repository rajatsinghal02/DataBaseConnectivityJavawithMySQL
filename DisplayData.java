package mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayData {
   public static void DisplayRecord()
   {
	   try {
		
	   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1000","root","1234");
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("Select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+""+rs.getString(2));
		}
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
}
