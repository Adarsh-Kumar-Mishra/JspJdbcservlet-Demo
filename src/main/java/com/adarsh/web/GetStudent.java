package com.adarsh.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adarsh.web.dao.StudentDao;
import com.adarsh.web.model.Student;


public class GetStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    int sid = Integer.parseInt(request.getParameter("student"));
	    StudentDao dao = new StudentDao();
	    Student s = dao.getStudent(sid);
	     
	    
	    request.setAttribute("showStudent", s);
	    RequestDispatcher rd = request.getRequestDispatcher("showStudent.jsp");
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
