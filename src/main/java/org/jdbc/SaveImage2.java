package org.jdbc;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SaveImage2 {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            String query = "insert into images(pic) value(?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done....");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
