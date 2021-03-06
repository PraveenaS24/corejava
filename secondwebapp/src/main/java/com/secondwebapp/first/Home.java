package com.secondwebapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet(name="Home",urlPatterns = {"/home","/house"},description="servlet for home page",
initParams= {@WebInitParam(name="phone",value="9384324894"),
        @WebInitParam(name="email",value="pravi@gmail.com")})
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Enumeration<String>initParamNames=getInitParameterNames();
        while(initParamNames.hasMoreElements())
        {
            String name=initParamNames.nextElement();
            out.print(name +" : "+getInitParameter(name)+"</p>");
        }
//        String adminEmail=getServletContext().getInitParameter("AdministratorEmail");
//        out.print(adminEmail+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
