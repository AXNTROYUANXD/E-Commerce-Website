package jspservlet.vo;

import java.util.ArrayList;

public class UserBuy {
	
	private String username;
	private ArrayList<String> commodityID;
	private ArrayList<String> number;
	private ArrayList<String> price;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public ArrayList<String> getCommodityID() {
		return commodityID;
	}
	public void setCommodityID(ArrayList<String> commodityID) {
		this.commodityID = commodityID;
	}
	public ArrayList<String> getNumber() {
		return number;
	}
	public void setNumber(ArrayList<String> number) {
		this.number = number;
	}
	public ArrayList<String> getPrice() {
		return price;
	}
	public void setPrice(ArrayList<String> price) {
		this.price = price;
	}
	
	
	

}