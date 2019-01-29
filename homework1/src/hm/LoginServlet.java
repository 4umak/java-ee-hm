package hm;

import javax.servlet.http.*;
import java.io.*;

/**
 * Created by Vitaliy on 25.01.2019
 */
public class LoginServlet extends HttpServlet {

    private static final String LOGIN = "admin";
    private static final String PASS = "admin";

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println(
                "<html>" +
                "<body>" +
                "<form method=\"post\" action=\"/\">" +
                "<p><input type=\"text\" name=\"login\" placeholder=\"Username or Email\"></p>\n" +
                "<p><input type=\"password\" name=\"password\" placeholder=\"Password\"></p>" +
                "<p class=\"submit\"><input type=\"submit\" name=\"commit\" value=\"Login\"></p>" +
                "</form>" +
                "</body>" +
                "</html>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        String login = (String) req.getParameter("login");
        String password = (String) req.getParameter("password");
        if (LOGIN.equals(login) && PASS.equals(password))
            out.println("Hi, " + login + "!");
        else
            out.println("Enter correct login and password!");
    }
}
