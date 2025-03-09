
package perform;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Forgot")
public class Forgot extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        response.setContentType("text/html");

   
        String email = request.getParameter("email");

        String expectedEmail = "rahulmadasu2000@gmail.com";


        if(expectedEmail.equals(email)) {
            response.getWriter().write("Login successful");
            System.out.println("Login successful for email: " + email);
        } else {
            response.getWriter().write("Invalid Credentials");
            System.out.println("Invalid Credentials for email: " + email);
        }
    }
}
