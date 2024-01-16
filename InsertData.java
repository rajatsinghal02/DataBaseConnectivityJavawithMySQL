package mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
private static Scanner sc;

public static String insertdata()
{
	sc = new Scanner(System.in);
	System.out.println("Enter the id:");
	int id=sc.nextInt();
	System.out.println("Enter the name");
	String name=sc.next();
	try 
	{
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1000","root","1234");
		Statement statement=connection.createStatement();
		statement.executeUpdate("INSERT INTO `1000`.`student` (`ID`, `Name`) VALUES ('"+id+"','"+name+"')");
		return "Data Added Successfully";
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return "Added";
}
}








