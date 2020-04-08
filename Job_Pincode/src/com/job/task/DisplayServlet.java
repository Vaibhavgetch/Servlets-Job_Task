package com.job.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	   Map<String,String> m = new HashMap<String,String>() ;
	   m.put("244306","Pune");
		m.put("201306","Noida");
		m.put("289301","Mumbain");
		m.put("201100","Banglore");
		String get_pincode=request.getParameter("pincode");
		String techno= request.getParameter("technologies");
		String city= "" ;
		if(m.containsKey(get_pincode)) {
			city=m.get(get_pincode);
			
			PrintWriter out = response.getWriter();
			if(city.equals("Pune")) {
				out.print("Jobs Availability : - ");
				if(techno.contains("Java") && techno.contains("Angular")) {
					out.print("Java Full Stack Developer");
				}else if(city.equals("Noida")) {
					out.print("Jobs Availability : - ");
					if(techno.contains("Python")) {
						out.print("AI Developer");
					}
					else if(techno.contains("Oracle")) {
							out.print("DBA");
						}
					else if(techno.contains("Juniper")) {
							out.print("Network Administrator");}
					
						else {
						out.print("Sorry, No jobs available at this location");
							}
				}
				
		
			}
		}

	}
}
