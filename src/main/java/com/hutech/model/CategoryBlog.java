/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hiệp Phan
 */
@Entity
@Table(name = "category_blog")
@NamedQueries({
    @NamedQuery(name = "CategoryBlog.findAll", query = "SELECT c FROM CategoryBlog c")})
public class CategoryBlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdCate")
    private Integer idCate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NameCate")
    private String nameCate;

    public CategoryBlog() {
    }

    public CategoryBlog(Integer idCate) {
        this.idCate = idCate;
    }

    public CategoryBlog(Integer idCate, String nameCate) {
        this.idCate = idCate;
        this.nameCate = nameCate;
    }

    public CategoryBlog(int aInt, String string, List<Blog> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getIdCate() {
        return idCate;
    }

    public void setIdCate(Integer idCate) {
        this.idCate = idCate;
    }

    public String getNameCate() {
        return nameCate;
    }

    public void setNameCate(String nameCate) {
        this.nameCate = nameCate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCate != null ? idCate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryBlog)) {
            return false;
        }
        CategoryBlog other = (CategoryBlog) object;
        if ((this.idCate == null && other.idCate != null) || (this.idCate != null && !this.idCate.equals(other.idCate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.CategoryBlog[ idCate=" + idCate + " ]";
    }
    
}
