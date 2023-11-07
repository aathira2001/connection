package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
   public static void main(String[] args) {
	   try {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("(url)","(userid)","(password)");
		   Statement statement=connection.createStatement();
		   statement.execute("insert into person values(111,'AthiraSunil',22)");
		   connection.close();
		   System.out.println("data saved");
	   }
	   catch(ClassNotFoundException|SQLException e) {
		   e.printStackTrace();
	   }
   }
}
