package mytest;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {
	static Connection connection;
	public static Connection CreateConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1000","root","1234");
            return connection;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}
	}
