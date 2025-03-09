
package perform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginfrom")
public class loginfrom extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username"); 
        String password = request.getParameter("password");
     

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if("rahul".equals(username) || "password".equals(password)) {
            out.println("<html><body>");
            out.println("<h2>Login Successful</h2>");
            out.println("<h3>Form Submission Details</h3>");
 
 
            out.println("<p>Username: " + username + "</p>");
            out.println("<p>Password: " + password + "</p>");

            out.println("</body></html>");
            System.out.println("Login successful for user: " + username);
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid Credentials</h2>");
            out.println("</body></html>");
            System.out.println("wrong credentials: " + username);
        }
        out.close();
    }
}
