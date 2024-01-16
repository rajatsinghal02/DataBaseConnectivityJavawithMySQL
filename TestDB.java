package mytest;

import java.util.Scanner;

public class TestDB {
public static void main(String[] args)
{
	System.out.println("Enter your Choice");
	System.out.println("1--> Display Data");
	System.out.println("2--> Insert Data");
	System.out.println("3--> Update Data");
	System.out.println("4--> Restart Code");
	System.out.println("5--> Exit");
	Scanner Sc=new Scanner(System.in);
	int ch=Sc.nextInt();
	if(ch==1)
	{
		DisplayData.DisplayRecord();
	}
	else if(ch==2)
	{
		InsertData.insertdata();
	}
	else if(ch==3)
	{
		UpdateData.DataUpdate();
	}
	else if(ch==4)
	{
		TestDB.main(args);
	}
	else if(ch==5)
	{
	System.exit(0);
	System.out.println("Program Terminated");
	}
	
	}
}

