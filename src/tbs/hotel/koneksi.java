package tbs.hotel;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D2K
 */
public class koneksi {
    private static Connection koneksi;
   public static Connection getKoneksi(){
    if(koneksi==null){
      try{
          String url = "jdbc:mysql://localhost:3306/rentalmobil";
          String user = "root";
          String pass = "";

          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
          koneksi= (Connection) DriverManager.getConnection(url,user,pass);
      }
      catch(SQLException t){
         JOptionPane.showMessageDialog(null,"Error Membuat Koneksi");
      }
    }
    return koneksi;
  }
}
