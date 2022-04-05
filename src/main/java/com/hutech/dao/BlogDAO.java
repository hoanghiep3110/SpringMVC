/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.databases.JDBCConnection;
import com.hutech.model.Blog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huynh
 */
public class BlogDAO {
    JDBCConnection con = new JDBCConnection();

    public List<Blog> getList() throws SQLException {
        List<Blog> list = new ArrayList<>();
        String sql = "SELECT * FROM `blog`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Blog b = new Blog();
            b.setIdBlog(rs.getInt(1));
            b.setIdCate(rs.getInt(2));
            b.setTitle(rs.getString(3));
            b.setIdUser(rs.getInt(4));
            b.setContent(rs.getString(5));
            b.setLinkImg(rs.getString(6));
            b.setDateCreate(rs.getDate(7));
            list.add(b);
        }
        return list;
    }

    public Blog getByID(int id) throws SQLException {
        String sql = "SELECT * FROM `blog` WHERE IdBlog = " + id + "";
        ResultSet rs = con.LoadData(sql);
        Blog b = new Blog();
        if (rs.next()) {
            b.setIdBlog(rs.getInt(1));
            b.setIdCate(rs.getInt(2));
            b.setTitle(rs.getString(3));
            b.setIdUser(rs.getInt(4));
            b.setContent(rs.getString(5));
            b.setLinkImg(rs.getString(6));
            b.setDateCreate(rs.getDate(7));
        }
        return b;
    }

    public void insert(Blog b) {
        String sql = "INSERT INTO `blog`(`IdCate`, `Title`, `IdUser`,`Content`,`LinkImg`,`DateCreate`) "
                + "VALUES ('" + b.getIdCate() + "','" + b.getTitle()+ "','" + b.getIdUser()+ "','" + b.getContent()+ "','" + b.getLinkImg()+ "','" + b.getDateCreate()+ "')";
        con.UpdateData(sql);
        System.out.println(sql);
    }

    public void delete(int b) {
        String sql = "DELETE FROM `blog` WHERE IdBlog =" + b + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void update(Blog b) {
        String sql = "UPDATE `blog` SET `IdCate`='" + b.getIdCate() + "',"
                + "',`Title`='" + b.getTitle() + "',`IdUser`='" + b.getIdUser() + "',`Content`='" + b.getContent() + "',`LinkImg`='" + b.getLinkImg() + "',`DateCreate`='" + b.getDateCreate() + "'"
                + " WHERE IdBlog = " + b.getIdBlog() + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }
}
