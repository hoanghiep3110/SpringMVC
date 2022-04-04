/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;

import com.hutech.dao.BlogDAO;
import com.hutech.dao.CateBlogDAO;
import com.hutech.model.Blog;
import com.hutech.model.CategoryBlog;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author huynh
 */
public class BlogController {

    BlogDAO blogDAO = new BlogDAO();
    CateBlogDAO cateBlogDAO = new CateBlogDAO();

    @RequestMapping(value = {"/blog"})
    public String blog(Model model) throws SQLException {
        model.addAttribute("listBlog", blogDAO.getList());
        model.addAttribute("listCateBlog", cateBlogDAO.getList());
        return "user/blog";
    }

    @RequestMapping(value = {"/detail/{idblog}"})
    public String detail(Model model, @PathVariable("idblog") int idblog, HttpServletRequest request) throws SQLException {
        Blog blog = new BlogDAO().getByID(idblog);
        System.out.println(blog.getTitle());
        String newUri = request.getRequestURL().toString();
        model.addAttribute("urlShare", newUri);
        System.out.println(newUri);
        model.addAttribute("blogDetail", blog);
        return "user/blogdetail";
    }

    @RequestMapping(value = {"/blog/{idcate}"})
    public String cate(Model model, @PathVariable("idcate") int idcate) throws SQLException {
        CategoryBlog categoryBlog = new CateBlogDAO().getByID(idcate);
        System.out.println(categoryBlog.getNameCate());
        model.addAttribute("categoryBlog", categoryBlog);
        return "user/categoryBlog";
    }
}
