package pro.wings;//by implementing servlet

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet implements Servlet {
	
	 ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("create object");

	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub 
		return this.config;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing....");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1> this is my output from servlet methos</h1>");
		out.println("<h1> todays date and time is"+new Date().toString()+"</h1>");

	}

	public String getServletInfo() {
		
		return "this servlet configure by me";
	}

	public void destroy() {
	System.out.println("going to destroy servelt object");

	}
}
