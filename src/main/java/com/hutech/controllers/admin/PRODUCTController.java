/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.controllers.admin;

import com.hutech.dao.BrandDAO;
import com.hutech.dao.ProductDAO;
import com.hutech.dao.TypeCarDAO;
import com.hutech.model.Product;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String product(Model model) throws SQLException {
        model.addAttribute("listProduct", productDAO.getList());
        return "admin/product";
    }

    @RequestMapping(value = {"/product/create"}, method = RequestMethod.POST)
    public String create(Model model, HttpServletRequest request) throws SQLException {
        String nameProduct = request.getParameter("NameProduct");
        Integer price = Integer.parseInt(request.getParameter("Price"));
        String description = request.getParameter("Description");
        String status = request.getParameter("Status");
        String linkimg = request.getParameter("LinkImg");
        Product s = new Product(null, ten, "Đang hoạt động", new Loaisan(idLoai), null);
        productDAO.insert(s);
        model.addAttribute("listProduct", productDAO.getList());
        model.addAttribute("listType", typeCarDAO.getList());
        model.addAttribute("listBrand", brandDAO.getList());
        return "admin/product";
    }

}
