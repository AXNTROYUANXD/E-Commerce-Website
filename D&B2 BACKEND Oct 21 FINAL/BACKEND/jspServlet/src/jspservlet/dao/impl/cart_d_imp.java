package jspservlet.dao.impl;

import jspservlet.dao.cart_d;
import jspservlet.db.jdbcutil;
import jspservlet.service.goods_m;
import jspservlet.vo.commodity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class cart_d_imp implements cart_d {
    private jspservlet.db.jdbcutil jdbcutil;
    public cart_d_imp() throws SQLException, ClassNotFoundException {
        jdbcutil = new jdbcutil();
    }
    @Override
    public List<commodity> find(String username) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * from `order` where username = ?";
        jdbcutil.setPreparedStatement(sql);
        PreparedStatement preparedStatement = jdbcutil.getPreparedStatement();
        preparedStatement.setString(1,username);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<commodity> list = new ArrayList<>();
        while (resultSet.next()){
            commodity com= new commodity_d_imp().find(resultSet.getInt(2));
            com.setCommodityID(resultSet.getInt(4));
            com.setAddedDate(resultSet.getDate(5));
            System.out.println(com);
            list.add(com);
        }
        return list;
    }

    @Override
    public List<commodity> findU(String username, int number) throws SQLException, ClassNotFoundException {
        String sql = "select * from `order` where number = ? and username = ?";
        jdbcutil.setPreparedStatement(sql);
        PreparedStatement preparedStatement = jdbcutil.getPreparedStatement();
        preparedStatement.setInt(1,number);
        preparedStatement.setString(2,username);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<commodity> list = new ArrayList<>();
        while (resultSet.next()){
            commodity com = new commodity_d_imp().find(resultSet.getInt(2));
            com.setCommodityID(resultSet.getInt(4));
            com.setAddedDate(resultSet.getDate(5));
            list.add(com);
        }
        return list;
    }

    @Override
    public void del(int number) throws SQLException {
        String sql = "delete from `order` where number = ?";
        jdbcutil.setPreparedStatement(sql);
        PreparedStatement preparedStatement = jdbcutil.getPreparedStatement();
        preparedStatement.setInt(1,number);
        preparedStatement.executeUpdate();
    }
}
