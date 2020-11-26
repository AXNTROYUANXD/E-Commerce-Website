package jspservlet.servlet;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jspservlet.dao.impl.UserDAOImpl;
import jspservlet.dao.UserDAO;
import jspservlet.vo.User;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		User user = new User();
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		System.out.println(user);
		UserDAO dao = new UserDAOImpl();
		int flag = 0;
		try
		{
			flag = dao.queryByUsername(user);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag == 1)
		{
			HttpSession session = req.getSession();
			session.setAttribute("username", user.getUsername());
			res.sendRedirect("./logedinhomepage.jsp"); // Jump.
		}
		else
		{
			HttpSession session = req.getSession();
			session.setAttribute("error", "Your username or password is incorrect. Please try again.");
			res.sendRedirect("./login.jsp");
		}
		
	}
	

}
