/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Setting;
import model.User;

/**
 *
 * @author phant
 */
public class SettingDAO extends BaseDAO {
    private static final String BASE_SQL = "SELECT setting_id, setting_name, setting_value, type_id, display_order, note, status FROM swp391.setting";
   
    public void insert(Setting s){
        String sql="insert into setting(setting_name, setting_value, type_id, display_order, note, status) values(?,?,?,?,?,?)";
        try{
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, s.getName());
            st.setString(2, s.getValue());
            st.setInt(3, s.getType_id());
            st.setInt(4, s.getOrder());
            st.setString(5, s.getNote());
            st.setInt(6, s.getStatus());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    
    public void update(Setting s, int setting_id) {
        String sql = "update setting set "
                + "setting_name=?,setting_value=?,type_id=?,display_order=?,note=?,status=? where setting_id=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
           
            st.setString(1, s.getName());
            st.setString(2, s.getValue());
            st.setInt(3, s.getType_id());
            st.setInt(4, s.getOrder());
            st.setString(5, s.getNote());
            st.setInt(6, s.getStatus());
            st.setInt(7, setting_id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Setting getSettingByID(String id) {
        String sql = "select setting_id, setting_name, setting_value, type_id, display_order, note, status from Setting where setting_id=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Setting(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    //get setting list
    public ArrayList<Setting> getAllSetting() {
    DBContext db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = BASE_SQL;
        ArrayList<Setting> listSetting = new ArrayList<>();
        try {
            db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Setting setting = new Setting();
                setting.setSetting_id(rs.getInt("setting_id"));
                setting.setName(rs.getString("setting_name"));
                setting.setValue(rs.getString("setting_value"));
                setting.setType_id(rs.getInt("type_id"));
                setting.setOrder(rs.getInt("display_order"));
                setting.setNote(rs.getString("note"));
                setting.setStatus(rs.getInt("status"));
                
                listSetting.add(setting);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SettingDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                db.closeConnection(con, ps, rs);
            } catch (SQLException ex) {
                Logger.getLogger(SettingDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listSetting;
    }
}
