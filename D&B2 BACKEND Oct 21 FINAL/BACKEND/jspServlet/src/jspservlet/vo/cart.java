package jspservlet.vo;

public class cart {
    private String username;
    private int commodityID;
    private int number;

    public cart(String username, int commodityID, int number) {
        this.username = username;
        this.commodityID = commodityID;
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCommodityID() {
        return commodityID;
    }

    public void setCommodityID(int commodityID) {
        this.commodityID = commodityID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "cart{" +
                "username='" + username + '\'' +
                ", commodityID=" + commodityID +
                ", number=" + number +
                '}';
    }
}
