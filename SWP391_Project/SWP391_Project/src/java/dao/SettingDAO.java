/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Setting;

/**
 *
 * @author phant
 */
public class SettingDAO extends BaseDAO {
    public void insert(Setting s){
        String sql="insert into setting(type_id,setting_title,setting_value,display_order,status) values(?,?,?,?,?)";
        try{
            PreparedStatement st=con.prepareStatement(sql);
            st.setInt(1, s.getType_id());
            st.setString(2, s.getTitle());
            st.setInt(3, s.getValue());
            st.setInt(4, s.getOrder());
            st.setInt(5, s.getStatus());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void update(Setting s, int setting_id) {
        String sql = "update setting set "
                + "type_id=?,setting_title=?,setting_value=?,display_order=?,status=? where setting_id=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, s.getType_id());
            st.setString(2, s.getTitle());
            st.setInt(3, s.getValue());
            st.setInt(4, s.getOrder());
            st.setInt(5, s.getStatus());
            st.setInt(6, setting_id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Setting getSettingByID(String id) {
        String sql = "select type_id, setting_title, setting_value, display_order, status from Setting where setting_id=?";
        try {
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Setting(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
