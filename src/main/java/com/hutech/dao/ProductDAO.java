/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.OrderDetail;
import com.hutech.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hiệp Phan
 */
public class ProductDAO {

    JDBCConnection con = new JDBCConnection();

    public List<Product> getList() throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM `product`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Product p = new Product();
            p.setIdProduct(rs.getInt(1));
            p.setNameProduct(rs.getString(2));
            p.setPrice(rs.getInt(3));
            p.setDescription(rs.getString(4));
            p.setStatus(rs.getString(5));
            p.setLinkImg(rs.getString(6));
            p.setIdBrand(new BrandDAO().getByID(rs.getInt(7)));
            p.setIdType(new TypeCarDAO().getByID(rs.getInt(8)));
            list.add(p);
        }
        return list;
    }

    public Product getByID(int id) throws SQLException {
        String sql = "SELECT * FROM `product` WHERE IdProduct = " + id + "";
        ResultSet rs = con.LoadData(sql);
        Product p = new Product();
        if (rs.next()) {
            p.setIdProduct(rs.getInt(1));
            p.setNameProduct(rs.getString(2));
            p.setPrice(rs.getInt(3));
            p.setDescription(rs.getString(4));
            p.setStatus(rs.getString(5));
            p.setLinkImg(rs.getString(6));
            p.setIdBrand(new BrandDAO().getByID(rs.getInt(7)));
            p.setIdType(new TypeCarDAO().getByID(rs.getInt(8)));
        }
        return p;
    }

    public List<Product> getByIdBrand(int idBrand) throws SQLException {
       List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM `product` WHERE IdBrand = " + idBrand + "";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Product p = new Product();
            p.setIdProduct(rs.getInt(1));
            p.setNameProduct(rs.getString(2));
            p.setPrice(rs.getInt(3));
            p.setDescription(rs.getString(4));
            p.setStatus(rs.getString(5));
            p.setLinkImg(rs.getString(6));
            p.setIdBrand(new BrandDAO().getByID(rs.getInt(7)));
            p.setIdType(new TypeCarDAO().getByID(rs.getInt(8)));
            list.add(p);
        }
        return list;
    }
    
    public List<Product> getByIdType(int idType) throws SQLException {
       List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM `product` WHERE IdType = " + idType + "";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Product p = new Product();
            p.setIdProduct(rs.getInt(1));
            p.setNameProduct(rs.getString(2));
            p.setPrice(rs.getInt(3));
            p.setDescription(rs.getString(4));
            p.setStatus(rs.getString(5));
            p.setLinkImg(rs.getString(6));
            p.setIdBrand(new BrandDAO().getByID(rs.getInt(7)));
            p.setIdType(new TypeCarDAO().getByID(rs.getInt(8)));
            list.add(p);
        }
        return list;
    }
    
    public void insert(Product p) {
        String sql = "INSERT INTO `product`(`IdBrand`,`IdType`, `NameProduct`, `Price`,`Description`,`Status`,`LinkImg`) "
                + "VALUES ('" + p.getIdBrand().getIdBrand() + "','" + p.getIdType().getIdType() + "','" + p.getNameProduct() + "','" + p.getPrice() + "','" + p.getDescription() + "','" + p.getStatus() + "','" + p.getLinkImg() + "')";
        con.UpdateData(sql);
        System.out.println(sql);
    }

    public void delete(int p) {
        String sql = "DELETE FROM `product` WHERE IdProduct =" + p + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void update(Product p) {
        String sql = "UPDATE `product` SET `IdBrand`='" + p.getIdBrand().getIdBrand() + "',"
                + "`IdType`='" + p.getIdType().getIdType() + "',`NameProduct`='" + p.getNameProduct() + "',`Price`='" + p.getPrice() + "',`Description`='" + p.getDescription() + "',`Status`='" + p.getStatus() + "',`LinkImg`='" + p.getLinkImg() + "'"
                + " WHERE IdProduct = " + p.getIdProduct() + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

}
