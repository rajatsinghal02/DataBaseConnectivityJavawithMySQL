package mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
private static Scanner sc;

public static String DataUpdate()
{
	sc = new Scanner(System.in);
	System.out.println("Enter the id where you want to update the data:");
	int Id=sc.nextInt();
	System.out.println("Enter the name you want to update");
	String Name=sc.next();
	try 
	{
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/1000","root","1234");
		Statement statement=connection.createStatement();
		statement.executeUpdate("UPDATE `1000`.`student` SET  `Name` = '"+Name+"' WHERE (`ID` = '"+Id+"');");
		return "Data Updated Successfully";
	}
	catch(Exception e){
		System.out.println(e);
	}
	return "Updated";
}
}
