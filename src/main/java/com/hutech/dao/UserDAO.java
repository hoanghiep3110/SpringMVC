/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hiệp Phan
 */
public class UserDAO {

    JDBCConnection con = new JDBCConnection();
    public List<User> getList() throws SQLException {
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM `user`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            User p = new User();
            p.setIdUser(rs.getInt(1));
            p.setIdRole(new UserRoleDAO().getByID(rs.getInt(2)));
            p.setFullName(rs.getString(3));
            p.setEmail(rs.getString(4));
            p.setUsername(rs.getString(5));
            p.setPassword(rs.getString(6));
            p.setAddress(rs.getString(7));
            p.setPhone(rs.getString(8));
            list.add(p);
        }
        return list;
    }

    public User getByID(int id) throws SQLException {
        String sql = "SELECT * FROM `user` WHERE IdUser  = " + id + "";
        ResultSet rs = con.LoadData(sql);
        User l = new User();
        if (rs.next()) {
            l.setFullName(rs.getString(3));
            l.setEmail(rs.getString(4));
            l.setAddress(rs.getString(7));
            l.setPhone(rs.getString(8));
        }
        return l;
    }

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
        String u = null;
        ResultSet rs = con.LoadData(sql);
        if (rs.next()) {
            u = rs.getString(3);
        }
        return u;
    }
}
