package jspservlet.dao;

import jspservlet.vo.User;

public interface UserDAO {
	public int queryByUsername(User user) throws Exception;
	public int insertByUsername(User user) throws Exception;
	public int identyByUsername(User user) throws Exception;
	public User getAllUserInfo(User user) throws Exception;
	public int updatePassword(User user) throws Exception;
	public int updateInformation(User user) throws Exception;
}
