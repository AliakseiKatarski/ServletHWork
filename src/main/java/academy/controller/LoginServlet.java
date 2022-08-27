package academy.controller;

import academy.entities.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login=req.getParameter("login");
        String pass=req.getParameter("password");
        User user=new User(login,pass);
        HttpSession session= req.getSession();
        session.setAttribute("currentUser",user);
        RequestDispatcher view=req.getRequestDispatcher("login.jsp");
        view.forward(req,resp);

    }
}
