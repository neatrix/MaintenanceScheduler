

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
        super();
      
    }

	

	
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
      
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
              
        String n=request.getParameter("username");  
        String p=request.getParameter("userpass");  
              
        if(Validation.validate(n, p)){  
        	request.setAttribute("name", n);
            RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");  
            rd.forward(request,response);  
           Scheduler objsc=new Scheduler();
           objsc.check();
        }  
        else{  
            out.print("Kullanici adi veya sifre hatali");  
            RequestDispatcher rd=request.getRequestDispatcher("index.html");  
            
            rd.include(request,response);  
        }  
              
        out.close();  
        }  

}
