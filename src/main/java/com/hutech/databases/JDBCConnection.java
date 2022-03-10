/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hiệp Phan
 */
public class JDBCConnection {

    private static String DB_URL = "jdbc:mysql://localhost:3306/dbbanxe";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static void main(String args[]) {
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from blog");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)+ "  " + rs.getString(3));
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static Connection getConnection(String dbURL, String userName,String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("Connect successfully!");
        } catch (Exception ex) {
            System.out.println("Connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
