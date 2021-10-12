package com.adarsh.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.adarsh.web.model.Student;

public class StudentDao {
     public Student getStudent(int sid) {
    	 Student s = new Student();
    	 
    	 
    	 try {
    		 Class.forName("com.mysql.cj.jdbc.Driver");  
    			
    			//creating a connection
    			Connection con=DriverManager.getConnection(  
    			"jdbc:mysql://localhost:3306/first_db","root","password");  
    		 Statement st = con.createStatement();
    		 ResultSet rs =  st.executeQuery("select * from student where sid ="+ sid);
    		 if(rs.next()) {
    			 s.setSid(rs.getInt("sid"));
    			 s.setSname(rs.getString("sname"));
    			 
    			 s.setSphone(rs.getString("sphone"));
    		 }
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
    	
    	 
    	 
    	 return s;
     }
}
