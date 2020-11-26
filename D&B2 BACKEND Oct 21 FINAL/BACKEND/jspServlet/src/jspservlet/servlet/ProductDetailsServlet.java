package jspservlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import jspservlet.dao.UserProductDetailsDAO;
import jspservlet.dao.impl.UserProductDetailsDAOImpl;
import jspservlet.vo.User;
import jspservlet.vo.UserProductDetails;


@SuppressWarnings("serial")
public class ProductDetailsServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		User user = new User();
		user.setUsername(req.getParameter("username"));
		
		UserProductDetails upd = new UserProductDetails();
		upd.setCommodityID(req.getParameter("commodityID")); // Get to know the chosen commodityID.
		System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" +req.getParameter("commodityID"));
		UserProductDetailsDAO dao = new UserProductDetailsDAOImpl();

		String str = null;
		
		try
		{
			str = dao.showProductDetails(upd);
			System.out.println("====dao.showProductDetails(upd):" + str);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		HttpSession session = req.getSession();
		
		String[] info = str.split("\\*");
		String commodityID = info[0];
		String cname = info[1];
		String price = info[2];
		String introduction = info[3];
		String store_storeID = info[4];
		String type = info[5];
		String addedDate = info[6];
		String picName = info[7];
		
		System.out.println("********PDServelt:" + commodityID + cname + price + introduction + store_storeID + type + addedDate + picName);
		
		session.setAttribute("details" + "commodityID", commodityID); 
        session.setAttribute("details" + "cname", cname); 
        session.setAttribute("details" + "price", price); 
        session.setAttribute("details" + "introduction", introduction); 
        session.setAttribute("details" + "store_storeID", store_storeID); 
        session.setAttribute("details" + "type", type); 
        session.setAttribute("details" + "addedDate", addedDate); 
        session.setAttribute("details" + "picName", picName); 
	
		if(req.getParameter("username") == null) {
			session.setAttribute("username", user.getUsername());
        	res.sendRedirect("./productdetail.jsp"); // Return to the search result page.
        	}
        else {
        	session.setAttribute("username", user.getUsername());
        	res.sendRedirect("./loginproductdetail.jsp"); 
        }
		
	}

}
