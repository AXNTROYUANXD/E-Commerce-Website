package jspservlet.servlet;
import jspservlet.vo.User;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserDAO;
import jspservlet.dao.impl.UserDAOImpl;


@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		this.doPost(req, res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		User user = new User();
		// Extracting typed info.
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		user.setFirstname(req.getParameter("firstname"));
		user.setLastname(req.getParameter("lastname"));
		user.setBirthday(req.getParameter("birthday"));

		UserDAO dao = new UserDAOImpl();
		int flag = 0;
		
		try
		{
			flag = dao.identyByUsername(user);
			if(flag != 1)
				dao.insertByUsername(user);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(flag == 1) // Duplicated username.
		{	
			HttpSession session = req.getSession();
			session.setAttribute("error", "This username is already existing, pelase login!");
			res.sendRedirect("./login.jsp");
		}
		else {
			HttpSession session = req.getSession();
			session.setAttribute("error", "Successful registration.");
			res.sendRedirect("./login.jsp");
		}
	}

}
