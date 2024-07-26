package org.example.demo;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        String id = request.getParameter("id");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("<h3>Details Entered</h3><br/>");

        out.print("ID: "+ id + "<br/>");
        out.print("First Name: "+ firstname +"<br/>");
        out.print("Last Name: "+ lastname +"<br/>");


        out.print("</body></html>");
    }

    public void destroy() {
    }
}