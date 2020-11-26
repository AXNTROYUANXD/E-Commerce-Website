package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserBuyDAO;
import jspservlet.dao.UserCartDAO;
import jspservlet.dao.impl.UserBuyDAOImpl;
import jspservlet.dao.impl.UserCartDAOImpl;
import jspservlet.vo.User;
import jspservlet.vo.UserBuy;
import jspservlet.vo.UserCartInfo;


@SuppressWarnings("serial")
public class BuyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		UserBuy buyinfo = new UserBuy();
		buyinfo.setUsername(req.getParameter("username"));
		System.out.println("UserBuyServlet: username = " + req.getParameter("username"));
		
		UserCartDAO dao = new UserCartDAOImpl();
		UserCartInfo info = new UserCartInfo();
		info.setUsername(req.getParameter("username"));
		UserBuyDAO daoBuy = new UserBuyDAOImpl();
		
		int flag = 0;
		double sum = 0;
		
		try
		{
			sum = daoBuy.buyItem(buyinfo);
			System.out.println("+++ Fan Hui Sum = " + sum);
			if(sum == 0) {
				flag = 1;
			} else {
				flag = dao.resertCart(info);
				if(flag != 0) flag = 1;
				System.out.println("+++ Qing Kong flag = " + flag);
				System.out.println("!!EMPTY!!");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag == 1)
		{	
			String sumstr = String.valueOf(sum);
			HttpSession session=req.getSession(); 
	        session.setAttribute("username", buyinfo.getUsername());
	        session.setAttribute("sum", sumstr);
	        res.sendRedirect("./purchasesuccess.jsp"); 
		}
		else
		{
			res.sendRedirect("./error.jsp");
		}
	
	}
}
