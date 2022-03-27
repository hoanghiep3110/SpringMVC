/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.UserRole;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hiệp Phan
 */
public class UserRoleDAO {

    JDBCConnection con = new JDBCConnection();
    
    public List<UserRole> getListUserRole() throws SQLException {
        List<UserRole> listUserRole = new ArrayList<>();
        String sql = "SELECT * FROM `user_role`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            UserRole ur = new UserRole();
            ur.setIdRole(rs.getInt(1));
            ur.setRoleName(rs.getString(2));   
            listUserRole.add(ur);
        }
        return listUserRole;
    }

    public void insert(UserRole u) throws SQLException {
        String sql = "INSERT INTO `user_role`(`RoleName`) VALUES (,'" + u.getRoleName() + "')";
        System.out.println(sql);
        con.UpdateData(sql);
    }
    
    public void edit(UserRole u) throws SQLException {
        String sql = "UPDATE `user_role` SET " + "`RoleName`='" + u.getRoleName() + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }
    
    public void delete(int idRole) {
        String sql = "DELETE FROM `user_role` WHERE IdRole = " + idRole + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }
}
