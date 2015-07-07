package com.kristiansen.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SleepServlet
 */

@WebServlet("/SleepServlet")
public class SleepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SleepServlet() {
        super();
        // No specific requirements for for constructor/initialization, calling parent class.
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String DurationOfSleep = request.getParameter("sleep");
	    response.setContentType("text/plain");
	    PrintWriter out = response.getWriter();
		 
		try {
			if (DurationOfSleep != null) 
			{
				Thread.sleep(Integer.parseInt(DurationOfSleep));
			    out.println("Hello World. I had a nice sleep of "+ DurationOfSleep +" milliseconds.");
			}
			else
			{
				out.println("Hello World.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	    
	}

}
