package jspservlet.vo;

import java.sql.Date;

public class commodity {
    private int commodityID;
    private int store_storeID;
    private String cname;
    private String price;
    private String introduction;
    private String type;
    private Date addedDate;
    private String picName;

    public commodity() {
    }

    public commodity(int commodityID, int store_storeID,String cname, String price, String introduction, String type, Date addedDate, String picName) {
        this.commodityID = commodityID;
        this.cname = cname;
        this.price = price;
        this.introduction = introduction;
        this.store_storeID = store_storeID;
        this.type = type;
        this.addedDate = addedDate;
        this.picName = picName;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }


    public int getStore_storeID() {
        return store_storeID;
    }

    public void setStore_storeID(int store_storeID) {
        this.store_storeID = store_storeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    @Override
    public String toString() {
        return "commodity{" +
                "commodityID=" + commodityID +
                ", store_storeID=" + store_storeID +
                ", cname='" + cname + '\'' +
                ", price='" + price + '\'' +
                ", introduction='" + introduction + '\'' +
                ", type='" + type + '\'' +
                ", addedDate=" + addedDate +
                ", picName='" + picName + '\'' +
                '}';
    }
}
