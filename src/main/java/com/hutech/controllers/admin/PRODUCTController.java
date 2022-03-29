/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.BrandDAO;
import com.hutech.dao.ProductDAO;
import com.hutech.dao.TypeCarDAO;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Hiệp Phan
 */
@Controller
@RequestMapping("/admin")
public class PRODUCTController {

    ProductDAO productDAO = new ProductDAO();
    TypeCarDAO typeCarDAO = new TypeCarDAO();
    BrandDAO brandDAO = new BrandDAO();

    @RequestMapping(value = {"/product"})
    public String product(Model model) throws SQLException {
        model.addAttribute("listProduct", productDAO.getList());
        return "admin/product";
    }

}
