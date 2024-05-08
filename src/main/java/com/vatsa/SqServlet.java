package com.vatsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//int k= Integer.parseInt(req.getParameter("k"));  // Redirect method
		
//		HttpSession session=req.getSession();  // sessions way
//		int k= (int) session.getAttribute("k");
		
		// cookie technique to fetch value
		
		int k=0;
		
		Cookie cookie[]=req.getCookies();
		for(Cookie c: cookie) {
			if(c.getName().equals("k")) k=Integer.parseInt(c.getValue());
		}
		
		k*=k;
		PrintWriter outPrintWriter=res.getWriter();
		outPrintWriter.println("Square of sum is :" + k);
	}
}
 