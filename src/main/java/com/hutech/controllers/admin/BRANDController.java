/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.BrandDAO;
import com.hutech.model.Brand;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Hiệp Phan
 */
@Controller
@RequestMapping("/admin")
public class BRANDController {

    BrandDAO brandDAO = new BrandDAO();

    @RequestMapping(value = {"/brand"})
    public String brand(Model model, HttpSession session) throws SQLException {
        if (session.getAttribute("adminName") == null) {
            return "redirect:/admin";
        }
        model.addAttribute("listBrand", brandDAO.getList());
        return "admin/brand";
    }

    @RequestMapping(value = {"/brand/create"}, method = RequestMethod.POST)
    public String create(Model model, HttpServletRequest request, MultipartFile image) throws SQLException, IOException {
        if (image.isEmpty()) {
            model.addAttribute("message", "Vui lòng chon file !");
        } else {
            try{
                String ten = request.getParameter("NameBrand");
                String hinh = "/resource/img/brand/" + image.getOriginalFilename();
                image.transferTo(new File( "H:\\CDCNPM\\SpringMVC\\src\\main\\webapp",hinh));
                Brand s = new Brand(ten, hinh);
                brandDAO.insert(s);

                model.addAttribute("listBrand", brandDAO.getList());
            } catch (Exception e) {
                model.addAttribute("message", "Lỗi !");
            }
        }

        return "admin/brand";
    }

    @RequestMapping(value = {"/brand/delete/{idBrand}"})
    public String delete(Model model, @PathVariable("idBrand") int idBrand) throws SQLException {
        brandDAO.delete(idBrand);

        model.addAttribute("listBrand", brandDAO.getList());
        return "admin/brand";
    }
}
