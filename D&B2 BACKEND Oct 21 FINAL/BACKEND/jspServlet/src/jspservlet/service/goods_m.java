package jspservlet.service;


import jspservlet.dao.impl.commodity_d_imp;
import jspservlet.db.jdbcutil;
import jspservlet.vo.commodity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class goods_m {
    private jspservlet.db.jdbcutil jdbcutil;
    public goods_m() throws SQLException, ClassNotFoundException {
        jdbcutil = new jdbcutil();
    }
    public commodity find(int commodityID) throws SQLException, ClassNotFoundException {
       return new commodity_d_imp().find(commodityID);
    }
}
