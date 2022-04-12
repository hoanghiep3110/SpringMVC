/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.Blog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
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
            b.setIdCate(new CateDAO().getByID(rs.getInt(2)));
            b.setIdUser(new UserDAO().getByID(rs.getInt(3)));
            b.setTitle(rs.getString(4));
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
            b.setIdCate(new CateDAO().getByID(rs.getInt(2)));
            b.setIdUser(new UserDAO().getByID(rs.getInt(3)));
            b.setTitle(rs.getString(4));
            b.setContent(rs.getString(5));
            b.setLinkImg(rs.getString(6));
            b.setDateCreate(rs.getDate(7));
        }
        return b;
    }

    public List<Blog> getByIdCate(int idCate) throws SQLException {
        List<Blog> list = new ArrayList<>();
        String sql = "SELECT * FROM `blog` WHERE IdCate = " + idCate + "";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Blog b = new Blog();
            b.setIdBlog(rs.getInt(1));
            b.setIdCate(new CateDAO().getByID(rs.getInt(2)));
            b.setIdUser(new UserDAO().getByID(rs.getInt(3)));
            b.setTitle(rs.getString(4));
            b.setContent(rs.getString(5));
            b.setLinkImg(rs.getString(6));
            b.setDateCreate(rs.getDate(7));
            list.add(b);
        }
        return list;
    }

    public void insert(Blog b) {
        String sql = "INSERT INTO `blog`(`IdCate`,`IdUser`, `Title`, `Content`,`LinkImg`,`DateCreate`) "
                + "VALUES ('" + b.getIdCate().getIdCate() + "','" + b.getIdUser().getIdUser() + "','" + b.getTitle() + "','" + b.getContent() + "','" + b.getLinkImg() + "','" + b.getDateCreate() + "')";
        con.UpdateData(sql);
        System.out.println(sql);
    }

    public void delete(int b) {
        String sql = "DELETE FROM `blog` WHERE IdBlog =" + b + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void update(Blog b) {
        String sql = "UPDATE `blog` SET `IdCate`='" + b.getIdCate().getIdCate() + "',"
                + "`IdUser`='" + b.getIdUser().getIdUser() + "',`Title`='" + b.getTitle() + "',`Content`='" + b.getContent() + "',`LinkImg`='" + b.getLinkImg() + "',`DateCreate`='" + b.getDateCreate() + "'"
                + " WHERE IdBlog = " + b.getIdBlog() + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

}


