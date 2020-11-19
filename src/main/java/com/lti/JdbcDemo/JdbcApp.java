package com.lti.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public JdbcApp(){
		
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Tahira1999$");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void getStudentDetails(){
		try {
			rs = st.executeQuery("Select * from student");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " " + rs.getString(3));
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}