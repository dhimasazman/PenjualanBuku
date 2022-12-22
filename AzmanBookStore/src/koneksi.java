/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Driver;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ANNUR
 */
public class koneksi {
    Connection con ;
    Statement stm;
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/penjualanbuku","root","");
            stm = con.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Base tidak ditemukan !");
        }
    }
}
