/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.BlogDAO;
import com.hutech.dao.CateDAO;
import com.hutech.dao.UserDAO;
import com.hutech.model.Blog;
import com.hutech.model.CategoryBlog;
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
@RequestMapping("/admin")
public class BLOGController {

    BlogDAO blogDAO = new BlogDAO();
    CateDAO cateDAO = new CateDAO();
    UserDAO userDAO = new UserDAO();

    @RequestMapping(value = {"/blog"})
    public String blog(Model model) throws SQLException {
        model.addAttribute("listBlog", blogDAO.getList());
        model.addAttribute("listCate", cateDAO.getList());
        model.addAttribute("listUser", userDAO.getList());
        return "admin/blog";
    }
    
    @RequestMapping(value = {"/blog/create"}, method = RequestMethod.POST)
    public String create(Model model, HttpServletRequest request ) throws SQLException {
        Integer idCate = Integer.parseInt(request.getParameter("IdCate"));
        CategoryBlog ca = new CategoryBlog(idCate);
        Integer idUser = Integer.parseInt(request.getParameter("IdUser"));
        User ur = new User(idUser);
        String title = request.getParameter("Title");
        String content = request.getParameter("Content");
        String linkimg = request.getParameter("LinkImg");
//        Date dateCreate = request.getParameter("DateCreate");
        Blog s = new Blog(null, ca, ur, title, content,linkimg,null);
        blogDAO.insert(s);
        model.addAttribute("listBlog", blogDAO.getList());
        model.addAttribute("listCate", cateDAO.getList());
        model.addAttribute("listUser", userDAO.getList());
        return "admin/blog";
    }
}