package jspservlet.dao;

import jspservlet.vo.userinfo;

import java.sql.SQLException;
import java.text.ParseException;

public interface userinfo_d {
        userinfo findAll(String username) throws SQLException;
        void update(userinfo uf, String username) throws SQLException, ParseException;
}
