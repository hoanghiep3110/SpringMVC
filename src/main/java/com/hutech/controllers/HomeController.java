/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;

import com.hutech.dao.BlogDAO;
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
    BlogDAO blogDAO = new BlogDAO();

    @RequestMapping("/")
    public String index(Model model) throws SQLException {
        model.addAttribute("listProduct", productDAO.getList());
        model.addAttribute("listBrand", brandDAO.getList());
        model.addAttribute("listBlog", blogDAO.getList());
        return "user/index";
    }

    @RequestMapping("/about")
    public String about() {
        return "user/about";
    }
    
    @RequestMapping("/contact")
    public String contact() {
        return "user/contact";
    }

    @RequestMapping("/blog")
    public String blog() {
        return "user/blog";
    }
}
