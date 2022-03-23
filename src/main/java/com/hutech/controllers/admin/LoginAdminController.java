/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.UserDAO;
import com.hutech.helper.MD5Hash;
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
@RequestMapping("/admin")
public class LoginAdminController {

    UserDAO userDao = new UserDAO();

    @RequestMapping(value = {""})
    public String login() {
        return "admin/login";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request, HttpSession session) throws SQLException {
        String username = request.getParameter("userName").trim();
        String pass = MD5Hash.getMd5(request.getParameter("passWord").trim());
        String fullname = userDao.getFullname(username, pass);
        boolean check = new UserDAO().isAdmin(username, pass);
        if (check == true) {
            session.setAttribute("adminName", fullname);
            return "redirect:index";
        }
        model.addAttribute("message", "<p style ='color:red'>Tên đăng nhập hoặc mật khẩu không đúng</p>");
        return "admin/login";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session, HttpServletRequest request) {
        session.removeAttribute("adminName");
        return "redirect:/admin";
    }
}
