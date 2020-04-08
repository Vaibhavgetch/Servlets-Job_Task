package com.job.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String get_pincode = request.getParameter("pincode") ;
		String[] technologies = request.getParameterValues("technologies");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Pincode  - "+get_pincode+"</br>");
		
		int techlen = technologies.length;
		out.print("Technologies - ");
		int i=0;
		while(i!=techlen) {
			out.print( technologies[i] + " ");
			i++;
		}
		out.print("</br>");
		out.print("<button><a href='Servlet2?pincode="+get_pincode+"&technologies="+technologies+"'>Search Jobs</a></button>");
	}
}

	
	


