package jspservlet.dao.impl;

import jspservlet.dao.userinfo_d;
import jspservlet.db.jdbcutil;
import jspservlet.vo.userinfo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class userinfo_d_imp implements userinfo_d {
    private jspservlet.db.jdbcutil jdbcutil;
    public userinfo_d_imp() throws SQLException, ClassNotFoundException {
        jdbcutil = new jdbcutil();
    }
    @Override
    public userinfo findAll(String username) throws SQLException {
        String sql = "select * from userinfo where username=?";
        jdbcutil.setPreparedStatement(sql);
        PreparedStatement preparedStatement = jdbcutil.getPreparedStatement();
        preparedStatement.setString(1,username);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            userinfo u = new userinfo(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
            return u;
        }
        jdbcutil.Close();
        return null;
    }

    @Override
    public void update(userinfo uf, String username) throws SQLException, ParseException {
        String sql = "update userinfo set password=?,birthday=?,firstName=?,lastName=? where username = ?";
        jdbcutil.setPreparedStatement(sql);
        PreparedStatement preparedStatement = jdbcutil.getPreparedStatement();
        preparedStatement.setString(1,uf.getPassword());
        System.out.println("+++++++++++" + uf.getPassword());
        preparedStatement.setString(2,uf.getBirthday());
        preparedStatement.setString(3,uf.getFirstName());
        preparedStatement.setString(4,uf.getLastName());
        preparedStatement.setString(5,username);
        preparedStatement.executeUpdate();
        jdbcutil.Close();
    }
}
