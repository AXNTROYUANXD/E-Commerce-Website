package jspservlet.dao;

import java.util.ArrayList;

import jspservlet.vo.UserCartInfo;
import jspservlet.vo.User;

public interface UserCartDAO {
	public int addToCart(UserCartInfo info) throws Exception;
	public int queryCart(UserCartInfo info) throws Exception;
	public ArrayList<String> currentCart(UserCartInfo info) throws Exception;
	public int resertCart(UserCartInfo info) throws Exception;
}
