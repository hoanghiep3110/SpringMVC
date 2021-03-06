/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;

import com.hutech.dao.UserDAO;
import com.hutech.helper.MD5Hash;
import com.hutech.model.*;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Hiệp Phan
 */
@Controller
public class UserController {

    UserDAO userDao = new UserDAO();

    @RequestMapping(value = {"/login"})
    public String login(Model model) {
        String title = "Đăng Nhập";
        model.addAttribute("title", title);
        return "login";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request, HttpSession session) throws SQLException {
        String username = request.getParameter("userName").trim();
        String pass = MD5Hash.getMd5(request.getParameter("passWord").trim());
        User u = userDao.getOneUser(username, pass);
        String fullname = u.getFullName();
        String id = String.valueOf(u.getIdUser());
        boolean check = new UserDAO().isUser(username, pass);
        if (check == true) {
            session.setAttribute("userName", fullname);
            session.setAttribute("idUser",id);      
            return "redirect:/";
        }
        model.addAttribute("message", "<p style ='color:red'>Tên đăng nhập hoặc mật khẩu không đúng</p>");
        return "login";
    }

    @RequestMapping(value = {"/register"})
    public String register(Model model) {
        String title = "Đăng Ký";
        model.addAttribute("title", title);
        return "register";
    }

    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
    public String register(Model model, HttpServletRequest request) throws SQLException {
        UserRole ur = new UserRole(2);
        String fullname = request.getParameter("fullName");
        String email = request.getParameter("email");
        String username = request.getParameter("userName").trim();
        String pass = MD5Hash.getMd5(request.getParameter("passWord").trim());
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        User u = new User(ur,fullname, email, username, pass, address, phone);
        userDao.insertUser(u);
        boolean check = new UserDAO().isUser(username, pass);
        if (check == true) {
            return "redirect:/login";
        }
        model.addAttribute("message", "<p style ='color:red'>Tên đăng nhập hoặc mật khẩu không đúng</p>");
        return "login";

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session, HttpServletRequest request) {
        session.removeAttribute("userName");
        session.removeAttribute("idUser");
        return "redirect:/";
    }
}
