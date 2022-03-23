/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hiệp Phan
 */
public class UserDAO {

    JDBCConnection con = new JDBCConnection();

    public boolean isAdmin(String username, String pass) throws SQLException {
        String sql = "SELECT * FROM `user` WHERE Username = '" + username + "' && Password = '" + pass + "' && IdRole = 1;";
        ResultSet rs = con.LoadData(sql);
        System.out.println(sql);
        return rs.next();
    }

    public boolean isUser(String username, String pass) throws SQLException {
        String sql = "SELECT * FROM `user` WHERE Username = '" + username + "' && Password = '" + pass + "' && IdRole = 2;";
        ResultSet rs = con.LoadData(sql);
        System.out.println(sql);
        return rs.next();
    }

    public void insertUser(User u) throws SQLException {
        String sql = "INSERT INTO `user`(`IdRole`,`Fullname`, `Email`, `Username`, `Password`, `Address`, `Phone`) VALUES (2,'" + u.getFullName() + "','" + u.getEmail() + "','" + u.getUsername() + "','" + u.getPassword() + "','" + u.getAddress() + "','" + u.getPhone() + "')";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public String getFullname(String username, String pass) throws SQLException {
        String sql = "SELECT * FROM `user` WHERE Username = '" + username + "' && Password = '" + pass + "'";
        System.out.println(sql);
        String u = null ;
        ResultSet rs = con.LoadData(sql);
        if (rs.next()) {
            u = rs.getString(3);
        }
        return u;
    }
}
