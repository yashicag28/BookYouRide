package com.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Extend HttpServlet class
public class LoginServlet extends HttpServlet {


    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");
        RequestDispatcher dispatcher= null;
        if (request.getParameter("uname").equalsIgnoreCase("Yashica") && request.getParameter("pwd").equalsIgnoreCase("Yashica")) {
             dispatcher = request.getRequestDispatcher("Booking.jsp");
            request.setAttribute("userName", request.getParameter("uname"));
            request.setAttribute("userContact", "1234556");
            dispatcher.forward(request, response);

        } else {
             dispatcher = request.getRequestDispatcher("index.jsp");
            request.setAttribute("error", "Invalid Login");
            dispatcher.forward(request, response);

        }
    }
}