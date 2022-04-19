/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.TypeCarDAO;
import com.hutech.model.Typecar;
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
public class TYPECARController {
    TypeCarDAO typeCarDAO = new TypeCarDAO();

    @RequestMapping(value = {"/typecar"})
    public String typecar(Model model, HttpSession session) throws SQLException {
        if (session.getAttribute("adminName") == null) {
            return "redirect:/admin";
        }
        model.addAttribute("listTypeCar", typeCarDAO.getList());
        return "admin/typecar";
    }
    
    @RequestMapping(value = {"/typecar/create"}, method = RequestMethod.POST)
    public String create(Model model, HttpServletRequest request, MultipartFile image) throws SQLException, IOException {
        if (image.isEmpty()) {
            model.addAttribute("message", "Vui lòng chon file !");
        } else {
            try{
                String ten = request.getParameter("NameBrand");
                String hinh = "/resource/img/typecar/" + image.getOriginalFilename();
                image.transferTo(new File( "H:\\CDCNPM\\SpringMVC\\src\\main\\webapp",hinh));
                Typecar s = new Typecar(ten, hinh);
                typeCarDAO.insert(s);

                model.addAttribute("listTypeCar", typeCarDAO.getList());
            } catch (Exception e) {
                model.addAttribute("message", "Lỗi !");
            }
        }

        return "admin/typecar";
    }

    @RequestMapping(value = {"/typecar/delete/{idType}"})
    public String delete(Model model, @PathVariable("idType") int idType) throws SQLException {
        typeCarDAO.delete(idType);

        model.addAttribute("listTypeCar", typeCarDAO.getList());
        return "admin/typecar";
    }
}
