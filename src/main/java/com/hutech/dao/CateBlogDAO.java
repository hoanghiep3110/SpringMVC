/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.databases.JDBCConnection;
import com.hutech.model.Blog;
import com.hutech.model.CategoryBlog;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huynh
 */
public class CateBlogDAO {
    JDBCConnection con = new JDBCConnection();

    public List<CategoryBlog> getList() throws SQLException {
        List<CategoryBlog> list = new ArrayList<>();
        String sql = "SELECT * FROM `category_blog`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            CategoryBlog categoryBlog = new CategoryBlog(rs.getInt(1), rs.getString(2), new BlogDAO().getList());
            list.add(categoryBlog);
        }
        return list;
    }

    public CategoryBlog getByID(int id) throws SQLException {
        String sql = "SELECT * FROM `category_blog` WHERE IdCate = " + id + "";
        ResultSet rs = con.LoadData(sql);
        CategoryBlog l = null;
        if (rs.next()) {
            l = new CategoryBlog(rs.getInt(1), rs.getString(2), new ArrayList<Blog>());
        }
        return l;
    }

    public void insert(CategoryBlog l) {
        String sql = "INSERT INTO `category_blog`(`NameCate`) "
                + "VALUES ('" + l.getNameCate()+ "')";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void update(CategoryBlog l) {
        String sql = "UPDATE `category_blog` SET "
                + "',`NameCate`='" + l.getNameCate() + "' WHERE IdCate = " + l.getIdCate()+ "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void delete(int IdCate) {
        String sql = "DELETE FROM `category_blog` WHERE IdCate = " + IdCate + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }
}
