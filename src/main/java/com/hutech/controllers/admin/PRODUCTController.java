/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.BrandDAO;
import com.hutech.dao.ProductDAO;
import com.hutech.dao.TypeCarDAO;
import com.hutech.model.Brand;
import com.hutech.model.Product;
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
public class PRODUCTController {

    ProductDAO productDAO = new ProductDAO();
    TypeCarDAO typeCarDAO = new TypeCarDAO();
    BrandDAO brandDAO = new BrandDAO();

    @RequestMapping(value = {"/product"})
    public String product(Model model, HttpSession session) throws SQLException {
        if (session.getAttribute("adminName") == null) {
            return "redirect:/admin";
        }
        model.addAttribute("listProduct", productDAO.getList());
        model.addAttribute("listBrand", brandDAO.getList());
        model.addAttribute("listType", typeCarDAO.getList());
        return "admin/product";
    }

    @RequestMapping(value = {"/product/create"}, method = RequestMethod.POST)
    public String create(Model model, HttpServletRequest request, MultipartFile image) throws SQLException, IOException {
        if (image.isEmpty()) {
            model.addAttribute("message", "Vui lòng chon file !");
        } else {
            try {
                String ten = request.getParameter("NameProduct");
                Integer gia = Integer.parseInt(request.getParameter("Price"));
                String trangthai = request.getParameter("Status");
                
                String hinh = "/resource/img/product/" + image.getOriginalFilename();
                image.transferTo(new File("H:\\CDCNPM\\SpringMVC\\src\\main\\webapp", hinh));
                
                String mota = request.getParameter("Description");
                Integer loaixe = Integer.parseInt(request.getParameter("TypeCar"));
                Typecar tc = new Typecar(loaixe);
                Integer hangxe = Integer.parseInt(request.getParameter("Brand"));
                Brand br = new Brand(hangxe);
                Product s = new Product(null,ten, gia, mota, trangthai, hinh, br, tc);
                productDAO.insert(s);

                model.addAttribute("listProduct", productDAO.getList());
            } catch (Exception e) {
                model.addAttribute("message", "Lỗi !");
            }
        }

        return "admin/product";
    }

    @RequestMapping(value = {"/product/delete/{idProduct}"})
    public String delete(Model model, @PathVariable("idProduct") int idProduct) throws SQLException {
        productDAO.delete(idProduct);

        model.addAttribute("listProduct", productDAO.getList());
        return "admin/product";
    }
}
