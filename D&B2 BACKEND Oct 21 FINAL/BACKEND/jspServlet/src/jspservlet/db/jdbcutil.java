package jspservlet.db;

import java.sql.*;

public class jdbcutil {
    private String url="jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Hongkong";
    private String user="root";
    private String password= "zjyad2000719";
    private Connection connection;
    private PreparedStatement preparedStatement;
    private Statement statement;

    public jdbcutil() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection =  DriverManager.getConnection(url,user,password);
    }
    public Connection getConnection(){
        return connection;
    }

    public void setPreparedStatement(String sql) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
    }

    public PreparedStatement getPreparedStatement(){
        return preparedStatement;
    }

    public void setStatement() throws SQLException {
        statement = connection.createStatement();
    }

    public Statement getStatement() throws SQLException {
       return statement;
    }

    public void Close() throws SQLException {
        if(preparedStatement!=null){
            preparedStatement.close();
        }
        if(statement!=null){
            statement.close();
        }
        if(connection!=null){
            connection.close();
        }
    }
}
