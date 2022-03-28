/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.databases.JDBCConnection;
import com.hutech.model.Product;
import com.hutech.model.Typecar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class TypeCarDAO {
     JDBCConnection con = new JDBCConnection();

    public List<Typecar> getList() throws SQLException {
        List<Typecar> list = new ArrayList<>();
        String sql = "SELECT * FROM `typecar`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Typecar typecar = new Typecar(rs.getInt(1), rs.getString(2), rs.getString(3), new ProductDAO().getList());
            list.add(typecar);
        }
        return list;
    }
    public Typecar getByID(int id) throws SQLException {
        String sql = "SELECT * FROM `typecar` WHERE IdType = " + id + "";
        ResultSet rs = con.LoadData(sql);
        Typecar l = null;
        if (rs.next()) {
            l = new Typecar(rs.getInt(1), rs.getString(2), rs.getString(3),new ArrayList<Product>());
        }
        return l;
    }
    public void insert(Typecar l) {
        String sql = "INSERT INTO `typecar`(`NameType`, `ImgType`) "
                + "VALUES ('" + l.getNameType() + "','" + l.getImgType() + "')";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void update(Typecar l) {
        String sql = "UPDATE `typecar` SET "
                +  "',`NameType`='" + l.getNameType()+"',`ImgType`='"+l.getImgType()+"' WHERE IdType = " + l.getIdType() + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void delete(int idType) {
        String sql = "DELETE FROM `typecar` WHERE IdType = " + idType + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }
}
