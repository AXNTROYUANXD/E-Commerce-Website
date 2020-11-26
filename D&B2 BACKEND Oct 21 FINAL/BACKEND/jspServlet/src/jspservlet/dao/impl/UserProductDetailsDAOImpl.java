package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jspservlet.dao.UserProductDetailsDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.UserProductDetails;

public class UserProductDetailsDAOImpl implements UserProductDetailsDAO {

	@Override
	public String showProductDetails(UserProductDetails upd) throws Exception {
		// TODO Auto-generated method stub
		// Return particular product information.
		String commodityID = upd.getCommodityID();
		System.out.println("-----------------------commodityID in IMPL:" + commodityID);
		String sql = "SELECT * FROM commodity WHERE commodityID=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		String str = null;
		StringBuffer sb = new StringBuffer();
		
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, commodityID);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				sb.append(rs.getString("commodityID"));
				sb.append("*");
				sb.append(rs.getString("cname"));
				sb.append("*");
				sb.append(rs.getString("price"));
				sb.append("*");
				sb.append(rs.getString("introduction"));
				sb.append("*");
				sb.append(rs.getString("store_storeID"));
				sb.append("*");
				sb.append(rs.getString("type"));
				sb.append("*");
				sb.append(rs.getString("addedDate"));
				sb.append("*");
				sb.append(rs.getString("picName"));
				sb.append("*");
			}
			str = sb.toString();
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
		
		return str;

	}


}
