package org.example.tp02_rabearimanana_bah_praud_gia1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final String USERNAME = "J2EE";
    private static final String PASSWORD = "J2EE";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            out.println("<html><body>");
            out.println("<h2>Bienvenue, " + username + "</h2>");
            out.println("<form action='RedirectServlet' method='get'>");
            out.println("<label for='action'>Type d'action:</label>");
            out.println("<select name='action' id='action'>");
            out.println("<option value='GoogleSearch'>GoogleSearch</option>");
            out.println("<option value='PageRedirect'>PageRedirect</option>");
            out.println("</select><br><br>");
            out.println("<label for='page'>URL ou terme de recherche:</label>");
            out.println("<input type='text' id='page' name='page' required><br><br>");
            out.println("<button type='submit'>Rediriger</button>");
            out.println("</form>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Erreur : Identifiants incorrects</h2>");
            out.println("<a href='login.html'>Réessayer</a>");
            out.println("</body></html>");
        }
    }
}
