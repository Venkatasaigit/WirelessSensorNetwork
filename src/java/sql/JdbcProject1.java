package com.jdbc.pack1;
import java.sql.connection;
import java.sql.DriverManager;
import java.sql.sqlException;
	public class SampleJdbc {
		static Connection con=null;
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc1";
			String user="root";
			String password="Sandeep@5974";
			con=DriverManager.getConnection(url,user,password);
			sd.insertData();
			System.out.println(con);
		}
		catch(ClassNotFoundException   | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	}