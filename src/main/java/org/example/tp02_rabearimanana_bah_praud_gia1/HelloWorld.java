package org.example.tp02_rabearimanana_bah_praud_gia1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        java.util.Date time = new Date();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello This is my first servlet!!!!</h1>");
        out.println("<h1>"+ time +"</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
