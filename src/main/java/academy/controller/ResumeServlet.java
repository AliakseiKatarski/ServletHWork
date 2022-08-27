package academy.controller;

import academy.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class ResumeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("resume.jsp");
        RequestDispatcher view_1 = req.getRequestDispatcher("denied.jsp");
        HttpSession session = req.getSession();
        User user= (User) session.getAttribute("currentUser");
        if(user==null){
            view_1.forward(req,resp);
        }else {
            view.forward(req,resp);
        }
    }
}
