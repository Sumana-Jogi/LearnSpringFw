package org.jdbc;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class SaveImage {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String user = "root";
            String pass = "Suman@543";
            Connection con = DriverManager.getConnection(url,user,pass);
            String query = "insert into images(pic) values(?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            FileInputStream fis = new FileInputStream("src/main/resources/sample1.png");
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done");

        }catch (Exception e){
            System.out.println("error uploading the image ... ");
            e.printStackTrace();
        }
    }
}
