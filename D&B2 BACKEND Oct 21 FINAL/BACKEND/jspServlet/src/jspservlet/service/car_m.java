package jspservlet.service;


import jspservlet.dao.impl.cart_d_imp;
import jspservlet.db.jdbcutil;
import jspservlet.vo.commodity;
import java.sql.SQLException;
import java.util.List;

public class car_m {
    private jspservlet.db.jdbcutil jdbcutil;
    public car_m() throws SQLException, ClassNotFoundException {
        jdbcutil = new jdbcutil();
    }
    public List<commodity> find(String username) throws SQLException, ClassNotFoundException {
       return new cart_d_imp().find(username);
    }
    public List<commodity> findU(String username,int number) throws SQLException, ClassNotFoundException {
        return new cart_d_imp().findU(username,number);
    }
    public void del(int number) throws SQLException, ClassNotFoundException {
       new cart_d_imp().del(number);
    }
}
