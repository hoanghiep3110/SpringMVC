/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.UserDAO;
import com.hutech.dao.UserRoleDAO;
import com.hutech.helper.MD5Hash;
import com.hutech.model.User;
import com.hutech.model.UserRole;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
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
public class USERController {
    
    UserDAO userDAO = new UserDAO();
    UserRoleDAO userroleDAO = new UserRoleDAO();

    @RequestMapping(value = {"/user"})
    public String user(Model model) throws SQLException {
        model.addAttribute("listUser", userDAO.getList());
        model.addAttribute("listUserRole", userroleDAO.getListUserRole());
        return "admin/user";
    }
    @RequestMapping(value = {"/user/create"}, method = RequestMethod.POST)
    public String create(Model model, HttpServletRequest request) throws SQLException {
        Integer idRole = Integer.parseInt(request.getParameter("IdRole"));
        UserRole ur = new UserRole(idRole);
        String fullName = request.getParameter("FullName");
        String email = request.getParameter("Email").trim();
        String username = request.getParameter("Username").trim();
        String password = MD5Hash.getMd5(request.getParameter("Password").trim());
        String address = request.getParameter("Address").trim();
        String phone = request.getParameter("Phone").trim();
        User n = new User(ur,fullName, email, username, password, address, phone);
        userDAO.insertUser(n);
        model.addAttribute("listUser", userDAO.getList());
        return "admin/user";
    }
    
    @RequestMapping(value = {"/user/edit"}, method = RequestMethod.POST)
    public String edit(Model model, HttpServletRequest request) throws SQLException {
        Integer idUser = Integer.parseInt(request.getParameter("IdUser"));
        Integer idRole = Integer.parseInt(request.getParameter("IdRole"));
        UserRole ur = new UserRole(idRole);
        String fullName = request.getParameter("FullName");
        String email = request.getParameter("Email").trim();
        String username = request.getParameter("Username").trim();
        String password = MD5Hash.getMd5(request.getParameter("Password").trim());
        String address = request.getParameter("Address").trim();
        String phone = request.getParameter("Phone").trim();
        User n = new User(idUser,ur,fullName, email, username, password, address, phone);
        userDAO.updateUser(n);
        model.addAttribute("listUser", userDAO.getList());
        return "admin/user";
    }
    
    @RequestMapping(value = {"/user/delete/{idUser}"})
    public String delete(Model model, @PathVariable("idUser") int idUser) throws SQLException {
        userDAO.deleteUser(idUser);

        model.addAttribute("listUser", userDAO.getList());
        return "admin/user";
    }
}
