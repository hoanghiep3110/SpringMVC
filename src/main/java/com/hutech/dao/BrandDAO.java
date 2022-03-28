/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.Brand;
import com.hutech.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class BrandDAO {
    JDBCConnection con = new JDBCConnection();

    public List<Brand> getList() throws SQLException {
        List<Brand> list = new ArrayList<>();
        String sql = "SELECT * FROM `brand`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Brand brand = new Brand(rs.getInt(1), rs.getString(2), rs.getString(3), new ProductDAO().getList());
            list.add(brand);
        }
        return list;
    }
    public Brand getByID(String id) throws SQLException {
        String sql = "SELECT * FROM `brand` WHERE IdBrand = " + id + "";
        ResultSet rs = con.LoadData(sql);
        Brand l = null;
        if (rs.next()) {
            l = new Brand(rs.getInt(1), rs.getString(2), rs.getString(3),new ArrayList<Product>());
        }
        return l;
    }
    public void insert(Brand l) {
        String sql = "INSERT INTO `brand`( `NameBrand`, `ImgBrand`) "
                + "VALUES ('" + l.getNameBrand() + "','" + l.getImgBrand() + "')";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void update(Brand l) {
        String sql = "UPDATE `brand` SET "
                +  "',`NameBrand`='" + l.getNameBrand()+"',`ImgBrand`='"+l.getImgBrand()+"' WHERE IdBrand = " + l.getIdBrand() + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void delete(int idBrand) {
        String sql = "DELETE FROM `brand` WHERE IdBrand = " + idBrand + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }
}
