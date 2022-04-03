/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hiệp Phan
 */
public class ContactDAO {

    JDBCConnection con = new JDBCConnection();

    public List<Contact> getListContact() throws SQLException {
        List<Contact> listContact = new ArrayList<>();
        String sql = "SELECT * FROM `contact`";
        ResultSet rs = con.LoadData(sql);
        while (rs.next()) {
            Contact ct = new Contact();
            ct.setIdContact(rs.getInt(1));
            ct.setIdUser(new UserDAO().getByID(rs.getInt(2)));
            ct.setTitle(rs.getString(3));
            ct.setEmail(rs.getString(4));
            ct.setContent(rs.getString(5));
            ct.setStatus(rs.getInt(6));
            listContact.add(ct);
        }
        return listContact;
    }

    public Contact getByID(int id) throws SQLException {
        String sql = "SELECT * FROM `contact` WHERE IdContact  = " + id + "";
        ResultSet rs = con.LoadData(sql);
        Contact l = new Contact();
        if (rs.next()) {
            l.setTitle(rs.getString(3));
            l.setEmail(rs.getString(4));
            l.setContent(rs.getString(5));
            l.setStatus(rs.getInt(6));
        }
        return l;
    }

    public void insertContact(Contact u) throws SQLException {
        String sql = "INSERT INTO `contact`(`IdUser`,`Title`, `Email`, `Content`, `Status`) VALUES ('" + u.getIdUser().getIdUser() + "','" + u.getTitle() + "','" + u.getEmail() + "','" + u.getContent() + "','" + u.getStatus() +  "')";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void EditContact(Contact u) throws SQLException {
        String sql = "UPDATE `contact` SET `IdUser`='" + u.getIdUser().getIdUser() + "',`Title`='" + u.getTitle() + "',"
                + "`Email`='" + u.getEmail() + "',`Content`='" + u.getContent() + "',`Status`='" + u.getStatus() + "' "
                + "WHERE IdContact = '" + u.getIdContact() + "'";
        System.out.println(sql);
        con.UpdateData(sql);
    }

    public void deleteContact(int IdContact) {
        String sql = "DELETE FROM `contact` WHERE IdContact =" + IdContact + "";
        System.out.println(sql);
        con.UpdateData(sql);
    }
}
