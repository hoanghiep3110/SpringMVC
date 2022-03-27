/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.UserRoleDAO;
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
public class UserRoleController {

    UserRoleDAO userRoleDAO = new UserRoleDAO();

    @RequestMapping(value = {"/userrole"})
    public String userrole(Model model) throws SQLException {
        model.addAttribute("listUserRole", userRoleDAO.getListUserRole());
        return "admin/userrole";
    }
    
//    @RequestMapping(value = {"/userrole/create"})
//    public String create() {
//        return "admin/userrole";
//    }
}
