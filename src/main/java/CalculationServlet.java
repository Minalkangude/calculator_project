import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/calculate")
public class CalculationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Get values as String
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        String op = request.getParameter("operation");

        // Convert String to int
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);

        int result = 0;

        // Switch Case
        switch (op) {
            case "add":
                result = num1 + num2;
                break;

            case "sub":
                result = num1 - num2;
                break;

            case "mul":
                result = num1 * num2;
                break;

            case "div":
                if (num2 != 0)
                    result = num1 / num2;
                else
                    result = 0;
                break;
        }

        // Send result to JSP
        request.setAttribute("result", result);
        request.getRequestDispatcher("/Result.jsp")
                .forward(request, response);

    }
}
