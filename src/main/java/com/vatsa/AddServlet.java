package com.vatsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException  {
		helper(req, res);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		helper(req, res);
	}
	private void helper(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
//		System.out.println(k);
//		PrintWriter out=res.getWriter();
//		out.println("the result is : " + k);
		
		// used for servlet of same browser request Dispatcher method
//		req.setAttribute("k",k);
//		RequestDispatcher rDispatcher=req.getRequestDispatcher("sq");
//		rDispatcher.forward(req, res);
		
		
		// 1. for  Servlet  of other browsers redirect method (value is passed in url)
		//res.sendRedirect("sq?k="+ k );
		 
		// 2: for  Servlet  of other browsers http session  method (value is stored in session)
//		 HttpSession session=req.getSession();
//		 session.setAttribute("k",k);
//		 res.sendRedirect("sq");
		 
		 // 3: cookie method send values in cookies
		 Cookie cookie=new Cookie("k",k+"");
		 res.addCookie(cookie);
		 res.sendRedirect("sq");
	}

}
