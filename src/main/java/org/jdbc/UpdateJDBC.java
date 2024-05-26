package org.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateJDBC {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            String query = "update table1 set tname=?, tcity=? where tid = 3";
            PreparedStatement pstmt = con.prepareStatement(query);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name = br.readLine();
            System.out.println("enter city");
            String city = br.readLine();
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();
            System.out.println("done ....");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
