/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.CateDAO;
import com.hutech.model.CategoryBlog;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ACER
 */
@Controller
@RequestMapping("/admin")
public class CATEGORYBLOGController {
     CateDAO cateDAO = new CateDAO();

    @RequestMapping(value = {"/categoryblog"})
    public String categoryblog(Model model) throws SQLException {
        model.addAttribute("listCate", cateDAO.getList());
        return "admin/categoryblog";
    }
    
     @RequestMapping(value = {"/categoryblog/create"}, method = RequestMethod.POST)
    public String create(Model model, HttpServletRequest request) throws SQLException {      
        String nameCate = request.getParameter("NameCate");
        CategoryBlog c = new CategoryBlog(nameCate);
        cateDAO.insert(c);
        model.addAttribute("listCate", cateDAO.getList());
        return "admin/categoryblog";
    }
    
    @RequestMapping(value = {"/categoryblog/edit"}, method = RequestMethod.POST)
    public String edit(Model model, HttpServletRequest request) throws SQLException { 
        Integer idCate = Integer.parseInt(request.getParameter("IdCate"));
        String nameCate = request.getParameter("NameCate");
        CategoryBlog c = new CategoryBlog(idCate,nameCate,null);
        cateDAO.update(c);
        model.addAttribute("listCate", cateDAO.getList());
        return "admin/categoryblog";
    }
    
    @RequestMapping(value = {"/categoryblog/delete/{idCate}"})
    public String delete(Model model, @PathVariable("idCate") int idCate) throws SQLException {
        cateDAO.delete(idCate);

        model.addAttribute("listCate", cateDAO.getList());
        return "admin/categoryblog";
    }
}
