/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "discount")
@NamedQueries({
    @NamedQuery(name = "Discount.findAll", query = "SELECT d FROM Discount d")})
public class Discount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdDiscount")
    private Integer idDiscount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CodeDiscount")
    private String codeDiscount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Value")
    private int value;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
    @OneToMany(mappedBy = "idDiscount")
    private Collection<Order> order1Collection;

    public Discount() {
    }

    public Discount(Integer idDiscount) {
        this.idDiscount = idDiscount;
    }

    public Discount(Integer idDiscount, String codeDiscount, int value, boolean status) {
        this.idDiscount = idDiscount;
        this.codeDiscount = codeDiscount;
        this.value = value;
        this.status = status;
    }

    public Integer getIdDiscount() {
        return idDiscount;
    }

    public void setIdDiscount(Integer idDiscount) {
        this.idDiscount = idDiscount;
    }

    public String getCodeDiscount() {
        return codeDiscount;
    }

    public void setCodeDiscount(String codeDiscount) {
        this.codeDiscount = codeDiscount;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Collection<Order> getOrder1Collection() {
        return order1Collection;
    }

    public void setOrder1Collection(Collection<Order> order1Collection) {
        this.order1Collection = order1Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiscount != null ? idDiscount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discount)) {
            return false;
        }
        Discount other = (Discount) object;
        if ((this.idDiscount == null && other.idDiscount != null) || (this.idDiscount != null && !this.idDiscount.equals(other.idDiscount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.Discount[ idDiscount=" + idDiscount + " ]";
    }
    
}
