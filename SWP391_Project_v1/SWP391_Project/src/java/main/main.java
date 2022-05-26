/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.BaseDAO;
import dao.SettingDAO;
import dao.UserDAO;
import model.Setting;
import model.User;

/**
 *
 * @author phant
 */
public class main {
    public static void main(String[] args) {
        UserDAO udb = new UserDAO();
        User u = new User("a", "a", "a", "a", 0);
        udb.insert(u);
}
}
