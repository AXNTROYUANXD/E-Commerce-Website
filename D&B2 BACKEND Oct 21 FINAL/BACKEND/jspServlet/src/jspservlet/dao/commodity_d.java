package jspservlet.dao;

import jspservlet.vo.commodity;

import java.sql.SQLException;

public interface commodity_d {
    commodity find(int commodityID) throws SQLException;
}
