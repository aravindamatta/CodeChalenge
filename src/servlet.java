

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/call")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");      
		 String message = " Invalid input!.";	
		 double v1=0,v4=0 ;
		 	if(!request.getParameter("ip").matches("[A-Za-z_]+") && !request.getParameter("ip").equals(null)&& !request.getParameter("ip").matches("^\\s*$")){
		 		v1=Double.parseDouble(request.getParameter("ip"));}
	        String v2 = request.getParameter("InputUM");
	        String v3 = request.getParameter("TargetUM");
	        if(!request.getParameter("sres").matches("[A-Za-z_]+") && !request.getParameter("sres").equals(null) && !request.getParameter("sres").matches("^\\s*$")){
	         v4 = Double.parseDouble(request.getParameter("sres")); }
	   	 
	        if (request.getParameter("ip").matches("[A-Za-z_]+") || request.getParameter("ip").matches("^\\s*$")|| request.getParameter("sres").matches("[A-Za-z_]+") || request.getParameter("sres").matches("^\\s*$") ){
	        	request.setAttribute("message", message);	        
	        }else{
	        	utility ut=new utility();    	
	        	request.setAttribute("message", ut.calc(v1, v2, v3, v4));
	        }
	    	request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}






