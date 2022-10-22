package com.sevlets;
import java.io.IOException;

import javax.servlet.*;

public class FirstServlet implements Servlet{
	
	ServletConfig conf;

	// Life cycle method
	@Override
	public void destroy() {
		
		System.out.println("Going to destroy sevlet object.....");
		
	}
	
	// non-Life cycle method

	@Override
	public ServletConfig getServletConfig() {

		return this.conf;
	}

	// non-Life cycle method
	@Override
	public String getServletInfo() {
		
		return "this servlet is created by DJ";
	}

	// Life cycle method
	@Override
	public void init(ServletConfig conf) throws ServletException {
		this.conf = conf;
		System.out.println("creating object...");
		
	}

	// Life cycle method
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Servicing....");
		// set the content type of the response
		resp.setContentType("text/html");
	//	PrintWritter 
		
	}
	

}
