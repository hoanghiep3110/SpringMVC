/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.BrandDAO;
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
public class BRANDController {

    BrandDAO brandDAO = new BrandDAO();

    @RequestMapping(value = {"/brand"})
    public String brand(Model model) throws SQLException {
        model.addAttribute("listBrand", brandDAO.getList());
        return "admin/brand";
    }
}
