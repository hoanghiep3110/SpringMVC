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
@Table(name = "typecar")
@NamedQueries({
    @NamedQuery(name = "Typecar.findAll", query = "SELECT t FROM Typecar t")})
public class Typecar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdType")
    private Integer idType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NameType")
    private String nameType;
    @Size(max = 400)
    @Column(name = "ImgType")
    private String imgType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idType")
    private List<Product> productList;

    public Typecar() {
    }

    public Typecar(Integer idType) {
        this.idType = idType;
    }

    public Typecar(Integer idType, String nameType) {
        this.idType = idType;
        this.nameType = nameType;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idType != null ? idType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typecar)) {
            return false;
        }
        Typecar other = (Typecar) object;
        if ((this.idType == null && other.idType != null) || (this.idType != null && !this.idType.equals(other.idType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.Typecar[ idType=" + idType + " ]";
    }
    
}
