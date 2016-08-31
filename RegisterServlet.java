package com.userregister;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
		
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String userName = req.getParameter("username");
	String pwd = req.getParameter("pass");
	String em = req.getParameter("email");
	String phn = req.getParameter("phno");
	PrintWriter printWriter = resp.getWriter();
	printWriter.append("With the entered details as provided");
	printWriter.append(userName).append(" \n").append(pwd).append("\n");
	printWriter.append(em).append("\n").append(phn).append("\n");
	printWriter.append("registration is successful");
	printWriter.close();
}
}
