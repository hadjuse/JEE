package org.example.tp02_rabearimanana_bah_praud_gia1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        String page = request.getParameter("page");

        if ("PageRedirect".equals(action) && page != null && !page.isEmpty()) {
            response.sendRedirect(page);
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<html><body>" +
                    "<p>Invalid parameters for redirection." +
                    "<br>Usage: /RedirectServlet?action=PageRedirect&page=URL" +
                    "</p></body></html>");
        }
    }
}
