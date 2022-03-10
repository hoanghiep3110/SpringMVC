/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.databases;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Hiệp Phan
 */
public class JDBCConnection {

    public static void main(String args[]) {
        try {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:1433/DBBanXe");
            dataSource.setUsername("sa");
            dataSource.setPassword("123456");
            System.out.println("ket noi thanh cong!");
        } catch (Exception e) { 
            System.out.println("ket noi that bai!");

        }
    }
}
