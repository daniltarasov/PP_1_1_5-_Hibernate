package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/pp_1_1_3-4_jdbc_hibernate";

    public static Connection getConnection() throws SQLException {

        return  DriverManager.getConnection(CONNECTION_URL, USER_NAME, PASSWORD);

//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(connectionURL, UserName, password);
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Ошибка подключения к БД");
//            e.getStackTrace();
//        }
//        return connection;

    }
}
