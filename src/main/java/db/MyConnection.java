package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection connection = null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/File_Hidder?useSSL=false","root", "/* enter your database password */");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("Connection ho gaya saab");
        return connection;
    }

    public static void closeConnection(){
        if(connection != null){
            try{
                connection.close();
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

}
