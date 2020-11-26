package jspservlet.dao;


import java.util.ArrayList;

import jspservlet.vo.UserSearch;

public interface UserSearchDAO {
	public ArrayList<String> searchContent(UserSearch content) throws Exception;
	public ArrayList<String> searchFliter(UserSearch content, UserSearch sortMode, UserSearch fliter) throws Exception;
}
