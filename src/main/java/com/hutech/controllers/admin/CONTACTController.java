/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.ContactDAO;
import com.hutech.dao.UserDAO;
import com.hutech.model.Contact;
import com.hutech.model.User;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Hiệp Phan
 */
@Controller
@RequestMapping("/admin")
public class CONTACTController {

    ContactDAO contactDAO = new ContactDAO();
    UserDAO userDAO = new UserDAO();

    @RequestMapping(value = {"/contact"})
    public String contact(Model model, HttpSession session) throws SQLException {
        if (session.getAttribute("adminName") == null) {
            return "redirect:/admin";
        }
        model.addAttribute("listContact", contactDAO.getListContact());
        model.addAttribute("listUser", userDAO.getList());
        return "admin/contact";
    }

    @RequestMapping(value = {"/contact/edit"}, method = RequestMethod.POST)
    public String edit(Model model, HttpServletRequest request) throws SQLException {
        Integer idContact = Integer.parseInt(request.getParameter("IdContact"));
        Integer idUser = Integer.parseInt(request.getParameter("IdUser"));
        User ur = new User(idUser);
        String title = request.getParameter("Title");
        String email = request.getParameter("Email");
        String content = request.getParameter("Content");
        Integer status = Integer.parseInt(request.getParameter("status"));

        Contact n = new Contact(idContact, ur, title, email, content, status);
        contactDAO.EditContact(n);
        model.addAttribute("listContact", contactDAO.getListContact());
        model.addAttribute("listUser", userDAO.getList());
        return "admin/contact";
    }

    @RequestMapping(value = {"/contact/delete/{idContact}"})
    public String delete(Model model, @PathVariable("idContact") int idContact) throws SQLException {
        contactDAO.deleteContact(idContact);

        model.addAttribute("listContact", contactDAO.getListContact());
        model.addAttribute("listUser", userDAO.getList());
        return "admin/contact";
    }
}
