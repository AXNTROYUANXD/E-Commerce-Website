package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserCartDAO;
import jspservlet.dao.impl.UserCartDAOImpl;
import jspservlet.vo.User;
import jspservlet.vo.UserCartInfo;

@SuppressWarnings("serial")
public class EmptyCartServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		int flag = 0;
		UserCartDAO dao = new UserCartDAOImpl();
		UserCartInfo user = new UserCartInfo();
		user.setUsername(req.getParameter("username"));
		HttpSession session1 = req.getSession();
		session1.setAttribute("username", user.getUsername());
		try
		{
			flag = dao.resertCart(user);
			//System.out.println("!!EMPTY!!");
			HttpSession session = req.getSession();
			session.setAttribute("cartItem", dao.currentCart(user)); // Display the empty cart.

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag == 1) {
			res.sendRedirect("./cart.jsp");
		}
		else {
			res.sendRedirect("./error.jsp");
		}
	}

}
