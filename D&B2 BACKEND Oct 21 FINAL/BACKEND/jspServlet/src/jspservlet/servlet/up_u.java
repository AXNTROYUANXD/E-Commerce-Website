package jspservlet.servlet;

import jspservlet.service.user_m;
import jspservlet.vo.userinfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/up_u")
public class up_u extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("utf-8");
            String username = (String)req.getSession().getAttribute("username");
            user_m user_m = new user_m();
            userinfo ui = new userinfo(null,req.getParameter("password").trim(),req.getParameter("birthday").trim(),req.getParameter("firstname").trim(),req.getParameter("lastname").trim());
            user_m.update(ui,username);
            resp.sendRedirect(req.getContextPath()+"/userinfo.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
