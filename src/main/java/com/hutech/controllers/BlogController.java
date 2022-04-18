/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;

import com.hutech.dao.BlogDAO;
import com.hutech.dao.CateDAO;
import com.hutech.model.Blog;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ACER
 */
@Controller
public class BlogController {

    BlogDAO blogDAO = new BlogDAO();

    @RequestMapping(value = {"/blog"})
    public String blog(Model model, @RequestParam(required = false) Integer idCate) throws SQLException {
        if (idCate != null) {
            model.addAttribute("listBlog", blogDAO.getByIdCate(idCate));
        } else {
            model.addAttribute("listBlog", blogDAO.getList());
        }
        model.addAttribute("listCate", new CateDAO().getList());
        String title = "Tạp Chí Xe";
        model.addAttribute("title", title);
        return "user/blog";
    }

    @RequestMapping(value = {"/blogdetail/{idblog}"})
    public String blogdetail(Model model, @PathVariable("idblog") int idblog, HttpServletRequest request) throws SQLException {
        Blog blog = new BlogDAO().getByID(idblog);
        model.addAttribute("blogDetail", blog);
        model.addAttribute("listCate", new CateDAO().getList());
        return "user/blogdetail";
    }
}
