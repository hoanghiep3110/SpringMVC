/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hiệp Phan
 */
@Entity
@Table(name = "product")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdProduct")
    private Integer idProduct;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NameProduct")
    private String nameProduct;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private int status;
    @JoinColumn(name = "IdBrand", referencedColumnName = "IdBrand")
    @ManyToOne(optional = false)
    private Brand idBrand;
    @JoinColumn(name = "IdType", referencedColumnName = "IdType")
    @ManyToOne(optional = false)
    private Typecar idType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduct")
    private List<ImgProduct> imgProductList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<OrderDetail> orderDetailList;
    @OneToMany(mappedBy = "idProduct")
    private List<Rent> rentList;

    public Product() {
    }

    public Product(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Product(Integer idProduct, String nameProduct, int price, String description, int status) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.status = status;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Brand getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Brand idBrand) {
        this.idBrand = idBrand;
    }

    public Typecar getIdType() {
        return idType;
    }

    public void setIdType(Typecar idType) {
        this.idType = idType;
    }

    public List<ImgProduct> getImgProductList() {
        return imgProductList;
    }

    public void setImgProductList(List<ImgProduct> imgProductList) {
        this.imgProductList = imgProductList;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public List<Rent> getRentList() {
        return rentList;
    }

    public void setRentList(List<Rent> rentList) {
        this.rentList = rentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.Product[ idProduct=" + idProduct + " ]";
    }
    
}
