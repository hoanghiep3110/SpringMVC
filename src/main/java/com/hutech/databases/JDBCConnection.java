/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hiệp Phan
 */
public class JDBCConnection {

    private static String DB_URL = "jdbc:mysql://localhost:3306/dbbanxe";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    Connection conn;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    public ResultSet LoadData(String sql) {
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void UpdateData(String sql) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
