package org.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class FirstJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String user = "root";
            String pass = "Suman@543";
            Connection con = DriverManager.getConnection(url,user,pass);

            //create table
//            String createQuery = "create table table1(tid int(20) primary key auto_increment, tname varchar(255) not null, tcity varchar(400))";
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate(createQuery);
//            System.out.println("table created...");

            //insert data using prepared stmt aka dynamic query
            String inertQueryDynamic = "insert into table1(tname, tcity) values(?,?)";
            PreparedStatement pstmt = con.prepareStatement(inertQueryDynamic);

//            pstmt.setString(1,"Sumana Jogi");
//            pstmt.setString(2,"Thirthahalli");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name :");
            String name = br.readLine();
            System.out.println("enter city :");
            String city = br.readLine();

            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();
            System.out.println("data inserted");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
