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

/**
 *
 * @author ACER
 */
@Controller
public class ProductController {

    ProductDAO productDAO = new ProductDAO();
    TypeCarDAO typeCarDAO = new TypeCarDAO();
    BrandDAO brandDAO = new BrandDAO();

    @RequestMapping(value = {"/product"})
    public String product(Model model) throws SQLException {
        model.addAttribute("listProduct", productDAO.getList());
        model.addAttribute("listType", typeCarDAO.getList());
        model.addAttribute("listBrand", brandDAO.getList());
        return "user/product";
    }

    @RequestMapping(value = {"/detail/{idproduct}"})
    public String detail(Model model, @PathVariable("idproduct") int idproduct, HttpServletRequest request) throws SQLException {
        Product product = new ProductDAO().getByID(idproduct);
        System.out.println(product.getNameProduct());
        String newUri = request.getRequestURL().toString();
        model.addAttribute("urlShare", newUri);
        System.out.println(newUri);
        model.addAttribute("productDetail", product);
        return "user/detail";
    }

    @RequestMapping(value = {"/product/{idbrand}"})
    public String brand(Model model, @PathVariable("idbrand") int idbrand) throws SQLException {
        Brand brand = new BrandDAO().getByID(idbrand);
        System.out.println(brand.getNameBrand());
        model.addAttribute("brand", brand);
        return "user/brand";
    }
}
