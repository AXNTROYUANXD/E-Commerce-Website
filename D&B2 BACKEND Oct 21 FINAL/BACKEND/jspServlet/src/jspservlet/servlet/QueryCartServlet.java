package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import jspservlet.dao.UserCartDAO;
import jspservlet.dao.impl.UserCartDAOImpl;
import jspservlet.vo.User;
import jspservlet.vo.UserCartInfo;
import jspservlet.vo.userinfo;


@SuppressWarnings("serial")
public class QueryCartServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		UserCartInfo user = new UserCartInfo();
		user.setUsername(req.getParameter("username"));
		HttpSession session1 = req.getSession();
		session1.setAttribute("username", user.getUsername());
		
		ArrayList<String> cartItem = new ArrayList<String>();
		UserCartDAO info = new UserCartDAOImpl();
		
		try{
			cartItem = info.currentCart(user);
			HttpSession session = req.getSession();
			session.setAttribute("cartItem", cartItem);
		}catch(Exception e){
			e.printStackTrace();
		}
		res.sendRedirect("./cart.jsp");
	}
	
}
