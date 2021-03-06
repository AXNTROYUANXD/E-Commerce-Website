package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jspservlet.dao.UserCartDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.UserCartInfo;
import jspservlet.vo.User;


public class UserCartDAOImpl implements UserCartDAO {
	
	public ArrayList<String> currentCart(UserCartInfo info) throws Exception
	{

		
		ArrayList<String> cartItem = new ArrayList<String>();
		cartItem.clear();
		
		StringBuffer sb = new StringBuffer();
		// Temporary string form data of all the matched info.
		String str = null;
		
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		
		try
		{
			dbc = new DBConnect();
			
			String sql = "SELECT * FROM cart NATURAL JOIN commodity WHERE username=?";
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, info.getUsername());
			
			ResultSet rs = pstmt.executeQuery();
			
			if(!rs.next()) { // No Item In Cart.
				cartItem.add("NoItemInCart");
				
			}
			else {
				rs.previous();// Back to the first row.
				while (rs.next()) {
	                // Put search result behind the current result.
					// * and % are the marks for splitting.
					sb.append(rs.getString("commodityID"));
					sb.append("*");
					sb.append(rs.getString("cname"));
					sb.append("*");
					sb.append(rs.getString("price"));
					sb.append("*");
					sb.append(rs.getString("picName"));
					sb.append("*");
					sb.append(rs.getString("number"));
					sb.append("%"); // End of the row.
	            }
				
				str = sb.toString();
				// Divided as encountered "%" and store in ArrayList
	            String[] params = str.split("\\%");
	            for(int i=0;i<params.length;i++) {
	            	cartItem.add(params[i]);
	            }
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			dbc.close();
		}
		return cartItem;
	}

	@Override
	public int addToCart(UserCartInfo info) throws Exception {
		int flag = 0;
		String sql = null;
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		
		flag = this.queryCart(info); // If cart already has the item.
		System.out.println("flag = " + flag);
		System.out.println(info.getNumber() + info.getUsername() + info.getCommodityID() + "_______________________-");
		if(flag == 1) // Has
		{
			dbc = new DBConnect();
			if(info.getNumber() == 0)
			{
				sql = "DELETE FROM cart WHERE username=? AND commodityID=?";
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setString(1, info.getUsername());
				pstmt.setString(2, info.getCommodityID());
			}
				
			else
			{
				sql = "UPDATE cart SET number=? WHERE username=? AND commodityID=?";
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setInt(1, info.getNumber());
				pstmt.setString(2, info.getUsername());
				pstmt.setString(3, info.getCommodityID());
			}	
			flag = pstmt.executeUpdate();
		}
		else // Do not have.
		{
			dbc = new DBConnect();
			
			if(info.getNumber() == 0)
			{// Do not add.
				flag = 1;
			}
			else
			{
				sql = "INSERT INTO cart VALUES(?,?,?)";
				pstmt = dbc.getConnection().prepareStatement(sql);
				pstmt.setString(1, info.getUsername());
				pstmt.setString(2, info.getCommodityID());
				pstmt.setInt(3, info.getNumber());
				
				boolean f = pstmt.execute(); // TRUE: execute query FALSE: execute update/delete/insert...
				System.out.println("++++++++"+f);
				if(!f)// Make sure it execute insert.
					flag = 1;
			}			
			
		}
		pstmt.close();
		return flag;
	}
	
	public int queryCart(UserCartInfo info) throws Exception
	{ // If it is currently existing.
		int flag = 0;
		String sql = "SELECT * FROM cart WHERE username=? AND commodityID=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, info.getUsername());
			pstmt.setString(2, info.getCommodityID());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				flag = 1;
			rs.close();
			pstmt.close();
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			dbc.close();
		}
		return flag;
	}
	
	
	public int resertCart(UserCartInfo info) throws Exception
	{
		int flag = 0;
		String sql = "DELETE FROM cart WHERE username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, info.getUsername());
			flag = pstmt.executeUpdate();
			pstmt.close();
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			dbc.close();
		}
		return flag;
	}
	
	
}
