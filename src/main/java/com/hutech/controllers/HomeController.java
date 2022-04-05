/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;

import com.hutech.dao.BrandDAO;
import com.hutech.dao.ProductDAO;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Hiệp Phan
 */
@Controller
public class HomeController {

    ProductDAO productDAO = new ProductDAO();
    BrandDAO brandDAO = new BrandDAO();

    @RequestMapping("/")
    public String index(Model model) throws SQLException {
        model.addAttribute("listProduct", productDAO.getList());
        model.addAttribute("listBrand", brandDAO.getList());
        String title = "Trang Chủ";
        model.addAttribute("title", title);
        return "user/index";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        String title = "Giới Thiệu";
        model.addAttribute("title", title);
        return "user/about";
    }
    

    @RequestMapping("/blog")
    public String blog(Model model) {
        String title = "Tạp Chí Xe";
        model.addAttribute("title", title);
        return "user/blog";
    }
}
