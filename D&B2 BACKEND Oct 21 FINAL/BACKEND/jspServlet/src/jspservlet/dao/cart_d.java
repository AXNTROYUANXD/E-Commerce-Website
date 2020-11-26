package jspservlet.dao;

import jspservlet.vo.commodity;

import java.sql.SQLException;
import java.util.List;

public interface cart_d {
    List<commodity> find(String username) throws SQLException, ClassNotFoundException;
    List<commodity> findU(String username, int number) throws SQLException, ClassNotFoundException;
    void del(int number) throws SQLException;
}
