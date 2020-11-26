package jspservlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import jspservlet.dao.UserSearchDAO;
import jspservlet.db.DBConnect;
import jspservlet.vo.UserSearch;

public class UserSearchDAOimpl implements UserSearchDAO {
	
	
	
	
	@Override
	public ArrayList<String> searchContent(UserSearch content) throws Exception {
		// TODO Auto-generated method stub
		
		// Final returned results.
		ArrayList<String> searchResult = new ArrayList<String>();
		searchResult.clear();
		// Use StringBuffer to add string content more convenient.
		StringBuffer sb = new StringBuffer();
		// Temporary string form data of all the matched info.
		String str = null;
		
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		
		
		try {
			
			dbc = new DBConnect();
			// Vaguely search statement.
			String sql = null;
			sql = "SELECT * FROM commodity WHERE cname LIKE ?" ;
			pstmt = dbc.getConnection().prepareStatement(sql);
			// Getting users' search content.
			pstmt.setString(1, "%" + content.getContent() + "%"); 

			
			// Start executing query.
			ResultSet rs = pstmt.executeQuery();
			if(!rs.next()) { // No match.
				searchResult.add("NoMatch");
				
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
					sb.append(rs.getString("addedDate"));
					sb.append("*");
					sb.append(rs.getString("picName"));
					sb.append("%"); // End of the row.
					//System.out.println("...............................SB" + sb);
	            }
				
				str = sb.toString();
				// Divided as encountered "%" and store in ArrayList
	            String[] params = str.split("\\%");
	            for(int i=0;i<params.length;i++) {
	            	searchResult.add(params[i]);
	            }
			}
			rs.close();
			pstmt.close();
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			dbc.close();
		}
		return searchResult;
	}
	
	
	
	
	@Override
	public ArrayList<String> searchFliter(UserSearch content, UserSearch sortMode, UserSearch fliter) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<String> searchResult = new ArrayList<String>();
		searchResult.clear();
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try {
			if(sortMode.getSortMode().equals("Default Mode")){
				
				if(fliter.getFliter().equals("Classic")){
					// Use StringBuffer to add string content more convenient.
					StringBuffer sb = new StringBuffer();
					// Temporary string form data of all the matched info.
					String str = null;
					
					dbc = new DBConnect();
					// Vaguely search statement.
					String sql = "SELECT * FROM commodity WHERE cname LIKE ? AND type = 'Classic'" ;
					pstmt = dbc.getConnection().prepareStatement(sql);
					// Getting users' search content.
					pstmt.setString(1, "%" + content.getContent() + "%"); 
					// Start executing query.
					ResultSet rs = pstmt.executeQuery();
					if(!rs.next()) { // No match.
						searchResult.add("NoMatch");
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
							sb.append(rs.getString("addedDate"));
							sb.append("*");
							sb.append(rs.getString("picName"));
							sb.append("%"); // End of the row.
			            }
						
						str = sb.toString();
						// Divided as encountered "%" and store in ArrayList
			            String[] params = str.split("\\%");
			            for(int i=0;i<params.length;i++) {
			            	searchResult.add(params[i]);
			            	}
					}
				} 
				if (fliter.getFliter().equals("Electronic")) {
					
						// Use StringBuffer to add string content more convenient.
						StringBuffer sb = new StringBuffer();
						// Temporary string form data of all the matched info.
						String str = null;
						
						dbc = new DBConnect();
						// Vaguely search statement.
						String sql = "SELECT * FROM commodity WHERE cname LIKE ? AND type = 'Electronic'" ;
						pstmt = dbc.getConnection().prepareStatement(sql);
						// Getting users' search content.
						pstmt.setString(1, "%" + content.getContent() + "%"); 
						// Start executing query.
						ResultSet rs = pstmt.executeQuery();
						if(!rs.next()) { // No match.
							searchResult.add("NoMatch");
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
								sb.append(rs.getString("addedDate"));
								sb.append("*");
								sb.append(rs.getString("picName"));
								sb.append("%"); // End of the row.
				            }
							
							str = sb.toString();
							// Divided as encountered "%" and store in ArrayList
				            String[] params = str.split("\\%");
				            for(int i=0;i<params.length;i++) {
				            	searchResult.add(params[i]);
				            	}
						}
				} 
				if(fliter.getFliter().equals("All")){
					searchResult.addAll(searchContent(content));
				}

			} 
			
			if(sortMode.getSortMode().equals("Latest Released")){
				if(fliter.getFliter().equals("Classic")) {
					// Use StringBuffer to add string content more convenient.
					StringBuffer sb = new StringBuffer();
					// Temporary string form data of all the matched info.
					String str = null;
					
					dbc = new DBConnect();
					// Vaguely search statement.
					String sql = "SELECT * FROM commodity WHERE cname LIKE ? AND type = 'Classic' ORDER BY addedDate DESC" ;
					pstmt = dbc.getConnection().prepareStatement(sql);
					// Getting users' search content.
					pstmt.setString(1, "%" + content.getContent() + "%"); 
					// Start executing query.
					ResultSet rs = pstmt.executeQuery();
					if(!rs.next()) { // No match.
						searchResult.add("NoMatch");
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
							sb.append(rs.getString("addedDate"));
							sb.append("*");
							sb.append(rs.getString("picName"));
							sb.append("%"); // End of the row.
			            }
						
						str = sb.toString();
						// Divided as encountered "%" and store in ArrayList
			            String[] params = str.split("\\%");
			            for(int i=0;i<params.length;i++) {
			            	searchResult.add(params[i]);
			            	}
					}
				}
				if(fliter.getFliter().equals("Electronic")) {
					// Use StringBuffer to add string content more convenient.
					StringBuffer sb = new StringBuffer();
					// Temporary string form data of all the matched info.
					String str = null;
					
					dbc = new DBConnect();
					// Vaguely search statement.
					String sql = "SELECT * FROM commodity WHERE cname LIKE ? AND type = 'Electronic' ORDER BY addedDate DESC" ;
					pstmt = dbc.getConnection().prepareStatement(sql);
					// Getting users' search content.
					pstmt.setString(1, "%" + content.getContent() + "%"); 
					// Start executing query.
					ResultSet rs = pstmt.executeQuery();
					if(!rs.next()) { // No match.
						searchResult.add("NoMatch");
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
							sb.append(rs.getString("addedDate"));
							sb.append("*");
							sb.append(rs.getString("picName"));
							sb.append("%"); // End of the row.
			            }
						
						str = sb.toString();
						// Divided as encountered "%" and store in ArrayList
			            String[] params = str.split("\\%");
			            for(int i=0;i<params.length;i++) {
			            	searchResult.add(params[i]);
			            	}
					}
				} 
				
				if(fliter.getFliter().equals("All")){
					
					// Use StringBuffer to add string content more convenient.
					StringBuffer sb = new StringBuffer();
					// Temporary string form data of all the matched info.
					String str = null;
					
					dbc = new DBConnect();
					// Vaguely search statement.
					String sql = "SELECT * FROM commodity WHERE cname LIKE ? ORDER BY addedDate DESC" ;
					pstmt = dbc.getConnection().prepareStatement(sql);
					// Getting users' search content.
					pstmt.setString(1, "%" + content.getContent() + "%"); 
					// Start executing query.
					ResultSet rs = pstmt.executeQuery();
					if(!rs.next()) { // No match.
						searchResult.add("NoMatch");
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
							sb.append(rs.getString("addedDate"));
							sb.append("*");
							sb.append(rs.getString("picName"));
							sb.append("%"); // End of the row.
			            }
						
						str = sb.toString();
						// Divided as encountered "%" and store in ArrayList
			            String[] params = str.split("\\%");
			            for(int i=0;i<params.length;i++) {
			            	searchResult.add(params[i]);
			            	System.out.println("..............................." + searchResult.get(i));
			            	}
					}
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			dbc.close();
		}
		//return searchResult; 
		return searchResult; 
	}
	
	
	

}
