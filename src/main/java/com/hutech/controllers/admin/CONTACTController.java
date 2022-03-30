/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.ContactDAO;
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
public class CONTACTController {

    ContactDAO contactDAO = new ContactDAO();

    @RequestMapping(value = {"/contact"})
    public String contact(Model model) throws SQLException {
        model.addAttribute("listContact", contactDAO.getListContact());
        return "admin/contact";
    }
}
