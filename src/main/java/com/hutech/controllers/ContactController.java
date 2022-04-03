/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;

import com.hutech.dao.ContactDAO;
import com.hutech.dao.UserDAO;
import com.hutech.model.Contact;
import com.hutech.model.User;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ACER
 */
@Controller
public class ContactController {

    ContactDAO contactDAO = new ContactDAO();
    UserDAO userDAO = new UserDAO();

    @RequestMapping(value = {"/contact"})
    public String contact(Model model) throws SQLException {
        model.addAttribute("listContact", contactDAO.getListContact());
        model.addAttribute("listUser", userDAO.getList());
        return "user/contact";
    }

    @RequestMapping(value = {"/user/contact"}, method = RequestMethod.POST)
    public String contact(Model model, HttpServletRequest request) throws SQLException {
        Integer idUser = request.getParameter("IdUser");
        String title = request.getParameter("Title");
        String email = request.getParameter("Email");
        String content = request.getParameter("Content");

        Contact n = new Contact( null,new User(idUser),title, email, content,0);
        contactDAO.insertContact(n);
        model.addAttribute("listContact", contactDAO.getListContact());
        model.addAttribute("listUser", userDAO.getList());
        return "user/contact";
    }
}
