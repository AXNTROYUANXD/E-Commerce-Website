package jspservlet.dao.impl;

import jspservlet.dao.UserDAO;
import jspservlet.vo.User;
import jspservlet.db.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {
	public int queryByUsername(User user) throws Exception {
		// Check username and password if they match to the database.
		int flag = 1;
		String sql = "SELECT * FROM userinfo WHERE username=? and password = ?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{ // Checking password.
				System.out.println(111);
					flag = 1;
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
		System.out.println(flag);
		return flag;
	}
	
	
	public int identyByUsername(User user) throws Exception
	{// Checking if there has current username.
		int flag = 0;
		String sql = "SELECT * FROM userinfo WHERE username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
					flag = 1;
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
		return flag;
	}
	
	
	public int insertByUsername(User user) throws Exception
	{
		int flag = 0;
		int rs = 0;
		flag = this.identyByUsername(user);
		if(flag == 1)
			return flag;
		
		String sql = "Insert INTO userinfo VALUE(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getBirthday());
			pstmt.setString(4, user.getFirstname());
			pstmt.setString(5, user.getLastname());
			rs = pstmt.executeUpdate();// Affected row numbers.
			pstmt.close();
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			dbc.close();
		}
		return rs;
	}
	
	public User getAllUserInfo(User user) throws Exception
	{
		User userInfo = new User();
		String sql = "SELECT * FROM userinfo WHERE username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				userInfo.setUsername(rs.getString("username"));
				userInfo.setFirstname(rs.getString("firstname"));
				userInfo.setLastname(rs.getString("lastname"));
				userInfo.setBirthday(rs.getString("birthday"));
				userInfo.setPassword(rs.getString("password"));
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
		return userInfo;
	}
	
	public int updatePassword(User user) throws Exception
	{
		int flag = 0;
		String sql = "UPDATE userinfo SET password=? WHERE username=? AND password=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getNewpassword());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());
			flag = pstmt.executeUpdate(); // Affected row numbers.
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
	
	public int updateInformation(User user) throws Exception
	{
		int flag = 0;
		String sql = "UPDATE userinfo SET firstname=?,lastname=?,birthday=? WHERE username=?";
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try
		{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getFirstname());
			pstmt.setString(2, user.getLastname());
			pstmt.setString(3, user.getBirthday());
			pstmt.setString(4, user.getUsername());
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
