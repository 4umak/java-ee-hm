package chumak;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

/**
 * Created by Vitaliy on 29.01.2019
 */
public class LoginServlet extends HttpServlet {

    private static final String LOGIN = "admin";
    private static final String PASS = "admin";


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        try (PrintWriter out = resp.getWriter()) {
            if (login.equals(LOGIN) && password.equals(PASS)) {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>First servlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Hello " + LOGIN + "!</h1>");
                out.println("</body>");
                out.println("</html>");
            } else
                resp.sendError(403, "Illegal login and password");
        }
    }
}
