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
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

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
    public String create(Model model, HttpServletRequest request, MultipartFile image) throws SQLException, IOException {  
        Integer idCate = Integer.parseInt(request.getParameter("IdCate"));
        CategoryBlog ca = new CategoryBlog(idCate);     
        
        Integer idUser = Integer.parseInt(request.getParameter("IdAdmin"));
        User ur = new User(idUser);
        
        String title = request.getParameter("Title");
        
        String content = request.getParameter("Content");
        
//        String linkimg = request.getParameter("image");
        String linkimg = "/resource/img/blog/" + image.getOriginalFilename();
        image.transferTo(new File("H:\\CDCNPM\\SpringMVC\\src\\main\\webapp", linkimg));
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        
        Blog s = new Blog(ca, ur, title, content, linkimg, date);
        blogDAO.insert(s);
        model.addAttribute("listBlog", blogDAO.getList());
//        model.addAttribute("listCate", cateDAO.getList());
//        model.addAttribute("listUser", userDAO.getList());
        return "admin/blog";
    }

    @RequestMapping(value = {"/blog/delete/{idBlog}"})
    public String delete(Model model, @PathVariable("idBlog") int idBlog) throws SQLException {
        blogDAO.delete(idBlog);

        model.addAttribute("listBlog", blogDAO.getList());
        return "admin/blog";
    }
}
