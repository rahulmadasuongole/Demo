
package perform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/email")
public class email extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email"); 
        String password = request.getParameter("password");
        String gender = request.getParameter("gender"); 

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();



        String expectedEmail = "rahulmadasu2000@gmail.com";
        String expectedPassword = "password";


        if(expectedEmail.equals(email) && expectedPassword.equals(password)) {
            out.println("<html><body>");
            out.println("<h2>Login Successful</h2>");
            out.println("<h3>Form Submission Details</h3>");
            out.println("<p>First Name: " + firstname + "</p>");
            out.println("<p>Last Name: " + lastname + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Password: " + password + "</p>");
            out.println("<p>Gender: " + gender + "</p>");
            out.println("</body></html>");
            System.out.println("Login successful for user: " + email);
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid Credentials</h2>");
            out.println("</body></html>");
            System.out.println("Invalid Credentials for user: " + email);
        }
        out.close();
    }
}
