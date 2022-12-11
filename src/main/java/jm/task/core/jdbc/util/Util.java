package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String UserName = "root";
    private static final String  password = "root";
    private static final String connectionURL = "jdbc:mysql://localhost:3306/pp_1_1_3-4_jdbc_hibernate";

    public static Connection getConnection() throws SQLException {

        return  DriverManager.getConnection(connectionURL, UserName, password);

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
