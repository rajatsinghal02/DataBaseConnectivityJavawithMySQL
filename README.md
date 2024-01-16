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

create table designation
(
    code int primary key auto_increment,
    title char(35) not null unique
);

This is MySQL code for creating a table.

Step 3 – Now, we want to access the data of this table using Java database connectivity.

Create a directory in your main drive (named gfg).
Now, inside gfg created two more directories one named as ‘src‘ and the other ‘lib‘.
Step 4 – We will write connectivity code in the src folder, To write connectivity code user must know the following information:

Driver class:- The driver class for connectivity of MySQL database “com.mysql.cj.jdbc.Driver”, after the driver has been registered, we can obtain a Connection instance that is connected to a particular database by calling DriverManager.getConnection():, in this method, we need to pass URL for connection and name and password of the database.
URL for Connection:- The connection URL for the mysql database is jdbc:mysql://localhost:3306/mydb (‘mydb’ is the name of database).
Specify to the DriverManager which JDBC drivers to try to make Connections use below line:
Class.forName("com.mysql.cj.jdbc.Driver"); 
  
To get connection object use below line :
Connection connection=DriverManager.getConnection("URL in string","username","password");
To get more clarification follow the connectivity code below:

Step 5 – In this src code, we will set up the connection and get all the data from the table. we have created the ‘check.java‘ file in the src folder.

