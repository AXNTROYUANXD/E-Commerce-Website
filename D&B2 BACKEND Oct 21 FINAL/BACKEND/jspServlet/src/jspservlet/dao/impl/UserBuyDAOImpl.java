package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import jspservlet.dao.UserBuyDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.UserBuy;


public class UserBuyDAOImpl implements UserBuyDAO {

	@SuppressWarnings("null")
	@Override
	public double buyItem(UserBuy uci) throws Exception {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> commodityID = new ArrayList<String>();
		
		double sum = 0;
		
		String currentTime= null;
		
		PreparedStatement pstmt = null, pstmt1 = null, pstmt3 = null, pstmt4 = null;
		DBConnect dbc = null;
		
		
		try
		{
			dbc = new DBConnect();
			
			String sql2 = "SELECT * FROM cart WHERE username=?" ;
			pstmt = dbc.getConnection().prepareStatement(sql2);
			pstmt.setString(1, uci.getUsername());
			StringBuffer sb = new StringBuffer();
			// Temporary string form data of all the matched info.
			String str = null;
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
                // Put search result behind the current result.
				// * and % are the marks for splitting.
				sb.append(rs.getString("commodityID"));
				System.out.println(rs.getString("commodityID"));
				sb.append("%"); // End of the row.
				str = sb.toString();
				System.out.println("str in buyImpl:::::::" + str);
			}
			// Divided as encountered "%" and store in ArrayList
			 String[] params = str.split("\\%");
			 commodityID.clear();
	            for(int i=0;i<params.length;i++) {
	            	commodityID.add(params[i]);
	            }
	        rs.close();
		        
		    if(!commodityID.get(0).equals("EmptyCart")) { // Not empty.
		    	for(int i = 0; i < commodityID.size(); i++) {
					String sql3 = "SELECT * FROM commodity WHERE commodityID=?" ;
					pstmt3 = dbc.getConnection().prepareStatement(sql3);
					System.out.println(")))))))))))))"+commodityID.get(i));
					pstmt3.setString(1, commodityID.get(i));
					ResultSet rs1 = pstmt3.executeQuery();
					double tempPrice = 0;
					if(rs1.next())
					tempPrice = Double.parseDouble(rs1.getString("price"));
					
					
					String sql4 = "SELECT * FROM cart WHERE username=? AND commodityID=?" ;
					pstmt4 = dbc.getConnection().prepareStatement(sql4);
					pstmt4.setString(1, uci.getUsername());
					pstmt4.setString(2, commodityID.get(i));
					int tempnumber = 0;
					ResultSet rs2 = pstmt4.executeQuery();
					if(rs2.next())
					tempnumber = Integer.parseInt(rs2.getString("number"));
					
					sum = sum + tempnumber*tempPrice; //!!!!!
					System.out.println("SUM::::::::::::::::" + sum);
					
					String sql1 = "INSERT INTO `order` VALUES(?,?,?,?,?)";
					pstmt1 = dbc.getConnection().prepareStatement(sql1);
					
					SimpleDateFormat df0 = new SimpleDateFormat("yyyyMMddHHmmss");// Set format.
					String currentTime0 = df0.format(new Date());
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// Set format.
					currentTime = df.format(new Date());
					String tempernum = String.valueOf(tempnumber);
					pstmt1.setString(1, currentTime0);
					pstmt1.setString(2, commodityID.get(i));
					pstmt1.setString(3, uci.getUsername());
					pstmt1.setString(4, tempernum);
					pstmt1.setString(5, currentTime);
					
					boolean f = pstmt1.execute();
					
					rs1.close();
			        rs2.close();
			        pstmt3.close();
			        pstmt4.close();
				}
				
				
				
				pstmt1.close();
				pstmt.close();
		    } else {
		    	sum = 0;
		    }
		   
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			dbc.close();
		}
		
		
		
		return sum;
	}

}
