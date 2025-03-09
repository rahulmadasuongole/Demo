
package perform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard")
public class dashboard extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Retrieving user input from the request
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String highestQualification = request.getParameter("highestQualification");
        String passoutYear = request.getParameter("passoutYear");
        String percentage = request.getParameter("percentage");
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String numberOfSiblings = request.getParameter("numberOfSiblings");

        // Expected values
        String expectedCity = "ongole";
        String expectedState = "ap";
        String expectedCountry = "india";

        String expectedHighestQualification = "btech";
        String expectedPassoutYear = "2023";
        String expectedPercentage = "8.9";

        String expectedFatherName = "prasadu";
        String expectedMotherName = "padma";
        String expectedNumberOfSiblings = "2";

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Form Submission Details</h2>");

    
        if (expectedCity.equalsIgnoreCase(city) && expectedState.equalsIgnoreCase(state) && expectedCountry.equalsIgnoreCase(country)) {
            out.println("<h3>Address Information: Submitted Successfully</h3>");
        } else {
            out.println("<h3>Address Information: Mismatch</h3>");
        }

     
        if (expectedHighestQualification.equalsIgnoreCase(highestQualification) &&
            expectedPassoutYear.equals(passoutYear) &&
            expectedPercentage.equals(percentage)) {
            out.println("<h3>Education Information: Submitted Successfully</h3>");
        } else {
            out.println("<h3>Education Information: Mismatch</h3>");
        }

        // Family details validation
        if (expectedFatherName.equalsIgnoreCase(fatherName) &&
            expectedMotherName.equalsIgnoreCase(motherName) &&
            expectedNumberOfSiblings.equals(numberOfSiblings)) {
            out.println("<h3>Family Details: Submitted Successfully</h3>");
        } else {
            out.println("<h3>Family Details: Mismatch</h3>");
        }

        out.println("</body></html>");
        out.close();
    }
}
