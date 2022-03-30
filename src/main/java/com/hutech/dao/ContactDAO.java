/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.dao;

import com.hutech.helper.JDBCConnection;
import com.hutech.model.Contact;
import com.hutech.model.UserRole;
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
            ct.setStatus(rs.getBoolean(6));
            listContact.add(ct);
        }
        return listContact;
    }
}
