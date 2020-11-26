package jspservlet.service;


import jspservlet.dao.impl.userinfo_d_imp;
import jspservlet.db.jdbcutil;
import jspservlet.vo.userinfo;

import java.sql.SQLException;
import java.text.ParseException;

public class user_m {
    private jspservlet.db.jdbcutil jdbcutil;
    public user_m() throws SQLException, ClassNotFoundException {
        jdbcutil = new jdbcutil();
    }
    public userinfo findAll(String username) throws SQLException, ClassNotFoundException {
        return new userinfo_d_imp().findAll(username);
    }
    public void update(userinfo uf, String username) throws SQLException, ClassNotFoundException, ParseException {
        new userinfo_d_imp().update(uf,username);
    }
}
