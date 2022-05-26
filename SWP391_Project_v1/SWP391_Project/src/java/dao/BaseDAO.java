/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phant
 */
public class BaseDAO {

    protected Connection con;
    public BaseDAO()
    {
        try {
            // Edit URL , username, password to authenticate with your MS SQL Server
            String url = "jdbc:mysql://127.0.0.1:3306/SWP391?zeroDateTimeBehavior=convertToNull&allowPublicKeyRetrieval=true&useSSL=false";
            String username = "root";
            String password = "mavis1999";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
    public void test(String a) {
        if (con == null) {
            System.out.println("something wrong");
        } else {
            System.out.println("ok");
        }
}
    
    
}
