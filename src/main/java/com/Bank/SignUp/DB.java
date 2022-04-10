package com.Bank.SignUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
	Connection con=null;
	PreparedStatement pst;
	public static Connection dbconnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		      // variables
		      final String url = "jdbc:mysql://localhost:3306/bank";
		      final String user = "root";
		      final String password = "root";

		      // establish the connection
		      Connection con = DriverManager.getConnection(url, user, password);
		      return con;
		}catch(Exception e2) {
			System.out.print(e2);
			return null;
		}
	}
	

}
