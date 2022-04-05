/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers;

import com.hutech.dao.BrandDAO;
import com.hutech.dao.ProductDAO;
import com.hutech.dao.TypeCarDAO;
import com.hutech.model.Brand;
import com.hutech.model.Product;
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
public class ProductController {

    ProductDAO productDAO = new ProductDAO();

    @RequestMapping(value = {"/product"})
    public String product(Model model ,@RequestParam(required = false) Integer idBrand ,@RequestParam(required = false) Integer idType) throws SQLException {
        if (idBrand != null) {
            model.addAttribute("listProduct", productDAO.getByIdBrand(idBrand));
        } else {
            model.addAttribute("listProduct", productDAO.getList());
        }
        model.addAttribute("listBrand", new BrandDAO().getList());
        if (idType != null) {
            model.addAttribute("listProduct", productDAO.getByIdType(idType));
        } else {
            model.addAttribute("listProduct", productDAO.getList());
        }
        model.addAttribute("listType", new TypeCarDAO().getList());
        
        return "user/product";
    }

    @RequestMapping(value = {"/detail/{idproduct}"})
    public String detail(Model model, @PathVariable("idproduct") int idproduct, HttpServletRequest request) throws SQLException {
        Product product = new ProductDAO().getByID(idproduct);
        System.out.println(product.getNameProduct());
        String newUri = request.getRequestURL().toString();
        model.addAttribute("urlShare", newUri);
        System.out.println(newUri);
        String title = "Chi Tiết Sản Phẩm";
        model.addAttribute("title", title);
        model.addAttribute("productDetail", product);
        return "user/detail";
    }

}
