package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection con;
    public static Connection getCon(){
        try {
            if(con==null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "Suman@543");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
