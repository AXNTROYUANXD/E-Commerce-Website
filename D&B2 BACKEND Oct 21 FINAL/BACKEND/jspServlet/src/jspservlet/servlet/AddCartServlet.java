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
import jspservlet.vo.UserCartInfo;

@SuppressWarnings("serial")
public class AddCartServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		UserCartInfo info = new UserCartInfo();
		info.setUsername(req.getParameter("username"));
		info.setCommodityID(req.getParameter("commodityID"));
		info.setNumber(Integer.parseInt(req.getParameter("number")));
		System.out.println(req.getParameter("username") + req.getParameter("commodityID") + req.getParameter("number") + "_______________________-");
		UserCartDAO dao = new UserCartDAOImpl();
		int flag = 0;
		@SuppressWarnings("unused")
		ArrayList<String> cartItem = new ArrayList<String>();
		cartItem.clear();
		String str = null;
		try
		{
			flag = dao.addToCart(info);
			cartItem = dao.currentCart(info);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(flag == 1)
		{
			HttpSession session=req.getSession(); 
			
			if(req.getParameter("username") == null)
	        	res.sendRedirect("./product.jsp"); // Return to the search result page.
	        else {
	        	session.setAttribute("username", info.getUsername());
	        	for(int i = 0;i < cartItem.size();i++){
	        		
	        		str = cartItem.get(i);
	        		String[] cartinfo = str.split("\\*");
	        		String commodityID = cartinfo[0];
	        		String cname = cartinfo[1];
	        		String price = cartinfo[2];
	        		String picName = cartinfo[3];
	        		String number = cartinfo[4];
	        		
	        		session.setAttribute("cart" + i + "commodityID", commodityID); 
			        session.setAttribute("cart" + i + "cname", cname); 
			        session.setAttribute("cart" + i + "price", price); 
			        session.setAttribute("cart" + i + "picName", picName); 
			        session.setAttribute("cart" + i + "number", number); 
			        
			        System.out.println("..................... current cart: " + i + commodityID + cname + price + picName);
	        		}
	        	res.sendRedirect("./cart.jsp"); 
	        }
		}
		else
		{
			res.sendRedirect("./error.jsp");
		}
	}
}
