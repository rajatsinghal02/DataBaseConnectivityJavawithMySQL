Connect MYSQL Database using JDBC Driver
JDBC- Java Database Connectivity

In Java, we can connect our Java application with the MySQL database through the Java code. JDBC ( Java Database Connectivity) is one of the standard APIs for database connectivity, using it we can easily run our query, statement, and also fetch data from the database.
Prerequisite to understand Java Database Connectivity with MySQL

 1. You should have MySQL on your System.
 2. You should have JDK on your System. 
 3. To set up the connectivity, the user should have MySQL Connector to the Java (JAR file), 
     the 'JAR' file must be in classpath while compiling and running the code of JDBC.
    
    Steps to download MySQL Connector
Step 1 – Search for MySQL community downloads.
Step 2 – Go to the Connector/J.
Step 3 – Select the Operating System platform-independent.
Step 4 – Download the zip file Platform Independent (Architecture Independent), ZIP Archive.

![image](https://github.com/rajatsinghal02/DataBaseConnectivityJavawithMySQL/assets/112543741/2b5a844a-e060-451a-9898-7c4a217f4768)
Step 5 – Extract the zip file.
Step 6 – Get the mysql-connector-java-8.0.20.jar file from the folder.
![image](https://github.com/rajatsinghal02/DataBaseConnectivityJavawithMySQL/assets/112543741/23cc05a9-874b-4755-a128-863792271561)
Setting up Database Connectivity with MySQL using JDBC code
Users have to follow the following steps:

Step 1 – Users have to create a database in MySQL (for example let the name of the database be ‘mydb’ ).
Step 2 – Create a table in that database.

Example:

create table Student
(
    id int primary key,
    name char(35) not null unique
);

This is MySQL code for creating a table.

Step 3 – Now, we want to access the data of this table using Java database connectivity.

Step 4 - Create a Java Project in Eclipse.We will write connectivity code in the src folder, To write connectivity code user must know the following information:
Steps to Connect Java with MYSQL Database- 
1. Load and Register Drivers
2. Create Connection
3. Create Statement 
4. Execute SQL Statement
5. Process the Result 
6. Close the Connection
Driver class:- The driver class for connectivity of MySQL database “com.mysql.cj.jdbc.Driver”, after the driver has been registered, we can obtain a Connection instance that is connected to a particular database by calling DriverManager.getConnection():, in this method, we need to pass URL for connection and name and password of the database.
URL for Connection:- The connection URL for the mysql database is jdbc:mysql://localhost:3306/mydb (‘mydb’ is the name of database).
Specify to the DriverManager which JDBC drivers to try to make Connections use below line:
Class.forName("com.mysql.cj.jdbc.Driver"); 
  
To get connection object use below line :
Connection connection=DriverManager.getConnection("URL in string","username","password");
To get more clarification follow the connectivity code below:

Step 5 – In this src code, we will set up the connection and get all the data from the table. we have created different-different  file in the src folder which further connected to each other.
1.TestDB.java 
It is the main class of Java project which contains a menu-driven code to perform the operations in Database and connected with all the other classes.
2.connect.java
This class is used for creating the connection with MySQL through JDBC Driver.
3. DisplayData.java
This class is used for Display the data in the console.
4.InsertData.java
This class is used for Insertion of Data in the Database.
5.UpdateData.java
This class is used for the Updation of Data in the Database.
