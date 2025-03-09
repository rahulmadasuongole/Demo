

package perform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Resetname")
public class ResetName extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String newPassword = request.getParameter("password"); 
        String confirmPassword = request.getParameter("confirm-password");
     
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        if("rahul".equals(newPassword) && "rahul".equals(confirmPassword)) {
            out.println("<html><body>");
            out.println("<h2>Password Reset Successful</h2>");
            out.println("<h3>Form Submission Details</h3>");
            out.println("<p>New Password: " + newPassword + "</p>");
            out.println("<p>Confirm Password: " + confirmPassword + "</p>");
            out.println("</body></html>");
            System.out.println("Password reset successful for password: " + newPassword);
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid Credentials</h2>");
            out.println("</body></html>");
            System.out.println("Password reset failed. Provided newPassword: " 
                + newPassword + ", confirmPassword: " + confirmPassword);
        }
        out.close();
    }
}