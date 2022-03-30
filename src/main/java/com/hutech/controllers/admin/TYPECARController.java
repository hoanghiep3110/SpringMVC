/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

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
public class TYPECARController {
    TypeCarDAO typeCarDAO = new TypeCarDAO();

    @RequestMapping(value = {"/typecar"})
    public String typecar(Model model) throws SQLException {
        model.addAttribute("listTypeCar", typeCarDAO.getList());
        return "admin/typecar";
    }
}
