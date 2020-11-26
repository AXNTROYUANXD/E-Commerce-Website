package jspservlet.dao.impl;

import jspservlet.dao.commodity_d;
import jspservlet.db.jdbcutil;
import jspservlet.vo.commodity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class commodity_d_imp implements commodity_d {
    private jdbcutil jdbcutil;
    public commodity_d_imp() throws SQLException, ClassNotFoundException {
        jdbcutil = new jdbcutil();
    }
    @Override
    public commodity find(int commodityID) throws SQLException {
        String sql = "select * from commodity where commodityID = ?";
        jdbcutil.setPreparedStatement(sql);
        PreparedStatement preparedStatement = jdbcutil.getPreparedStatement();
        preparedStatement.setInt(1,commodityID);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            return new commodity(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getDate(7),resultSet.getString(8));
        }
        return null;
    }
}
