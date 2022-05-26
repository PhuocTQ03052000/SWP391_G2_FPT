/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import model.Role;
import model.User;

/**
 *
 * @author phant
 */
public class UserDAO extends BaseDAO {
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*!@#$?";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;
 
    private static Random generator = new Random();
    
    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }
    
    public String randomPassword(int numberOfCharactor) {
        List<String> result = new ArrayList<>();
        Consumer<String> appendChar = s -> {
            int number = randomNumber(0, s.length() - 1);
            result.add("" + s.charAt(number));
        };
        appendChar.accept(digits);
        appendChar.accept(specials);
        while (result.size() < numberOfCharactor) {
            appendChar.accept(ALL);
        }
        Collections.shuffle(result, generator);
        return String.join("", result);
    }
    
    

    
    /**
     *
     * @param usern
     * @param pass
     * @return 
     */
    public User checkLogin(String usern, String pass){
        String query="SELECT * FROM swp391.user where username = ? and password = ?";
        try {
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1, usern);
            ps.setString(2, pass);
           ResultSet rs = ps.executeQuery();
            while(rs.next()){
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12), rs.getInt(13));
                return user;
            }
        } catch (SQLException e) {
        }
    return null;
    }
    public Role getRole(int role_id){
        String query="SELECT * FROM swp391.role where role_id=?";
        try {
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, role_id);
           ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Role role = new Role(rs.getInt(1),rs.getString(2));
                return role;
            }
        } catch (SQLException e) {
        }
    return null;
    }
   
}
