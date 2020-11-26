package jspservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspservlet.dao.UserSearchDAO;
import jspservlet.dao.impl.UserSearchDAOimpl;
import jspservlet.vo.UserSearch;

@SuppressWarnings("serial")
public class SearchServlet extends HttpServlet {


	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
	 }
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
			
			UserSearch content = new UserSearch();
			content.setContent(req.getParameter("content"));
			UserSearch sortMode = new UserSearch();
			sortMode.setSortMode(req.getParameter("sortMode"));
			UserSearch fliter = new UserSearch();
			fliter.setFliter(req.getParameter("fliter"));
			UserSearch user = new UserSearch();
			user.setUsername(req.getParameter("username"));
			System.out.println(">>>>>>>>>>>>>>>>>>>username:"+req.getParameter("username"));
			//System.out.println(",,,,,,,,,,,,,,," + content.getContent() + sortMode.getSortMode() + fliter.getFliter());
			
			// Temporary String for ArrayList.
			String str = null;
			ArrayList<String> searchResult = new ArrayList<String>();
			searchResult.clear();
			UserSearchDAO dao = new UserSearchDAOimpl();   
			
		    try {
					// Get all the result.
					searchResult.addAll(dao.searchFliter(content, sortMode, fliter));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			} 
			if(searchResult.get(0).equals("NoMatch")){  
				// No match.
				HttpSession session=req.getSession();  
				for(int i = 0; i < 10 ; i++) { // initialization
	        		session.setAttribute("searchResult" + i + "commodityID", null); 
			        session.setAttribute("searchResult" + i + "cname", null); 
			        session.setAttribute("searchResult" + i + "price", null); 
			        session.setAttribute("searchResult" + i + "addedDate", null); 
			        session.setAttribute("searchResult" + i + "picName", null); 
	        	}
		        session.setAttribute("searchResult", "Sorry, we haven't found any product match your keywords. Please try to change your keywords.");
		        if(req.getParameter("username") == null)
		        	res.sendRedirect("./product.jsp"); // Return to the search result page.
		        else {
		        	session.setAttribute("username", user.getUsername());
		        	res.sendRedirect("./logedinproduct.jsp"); 
		        }
		        } else {   
		        	
		        	HttpSession session=req.getSession(); 
		        	session.setAttribute("username", user.getUsername());
		        	
		        	
		        	for(int i = 0; i < 10 - searchResult.size(); i++) { // initialization
		        		session.setAttribute("searchResult" + i + "commodityID", null); 
				        session.setAttribute("searchResult" + i + "cname", null); 
				        session.setAttribute("searchResult" + i + "price", null); 
				        session.setAttribute("searchResult" + i + "addedDate", null); 
				        session.setAttribute("searchResult" + i + "picName", null); 
		        	}
		        	
		        	for(int i = 0;i < searchResult.size();i++){
		        		
		        		str = searchResult.get(i);
		        		String[] info = str.split("\\*");
		        		String commodityID = info[0];
		        		String cname = info[1];
		        		String price = info[2];
		        		String addedDate = info[3];
		        		String picName = info[4];
		        		
		        		session.setAttribute("searchResult" + i + "commodityID", commodityID); 
				        session.setAttribute("searchResult" + i + "cname", cname); 
				        session.setAttribute("searchResult" + i + "price", price); 
				        session.setAttribute("searchResult" + i + "addedDate", addedDate); 
				        session.setAttribute("searchResult" + i + "picName", picName); 
				        
				        System.out.println("....................." + i + commodityID + cname + price + addedDate + picName);
		        		}
		        	if(req.getParameter("username") == null) {
			        	res.sendRedirect("./product.jsp"); // Return to the search result page.
		        	}
			        else {
			        	session.setAttribute("username", user.getUsername());
			        	res.sendRedirect("./logedinproduct.jsp"); 
			        }
		        }
	 }
}
