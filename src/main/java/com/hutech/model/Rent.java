/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Hiệp Phan
 */
@Entity
@Table(name = "rent")
@NamedQueries({
    @NamedQuery(name = "Rent.findAll", query = "SELECT r FROM Rent r")})
public class Rent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdRent")
    private Integer idRent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateRent")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateBack")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateBack;
    @Column(name = "Price")
    private Integer price;
    @Column(name = "Status")
    private Boolean status;
    @JoinColumn(name = "IdProduct", referencedColumnName = "IdProduct")
    @ManyToOne
    private Product idProduct;
    @JoinColumn(name = "IdUser", referencedColumnName = "IdUser")
    @ManyToOne
    private User idUser;

    public Rent() {
    }

    public Rent(Integer idRent) {
        this.idRent = idRent;
    }

    public Rent(Integer idRent, Date dateRent, Date dateBack) {
        this.idRent = idRent;
        this.dateRent = dateRent;
        this.dateBack = dateBack;
    }

    public Integer getIdRent() {
        return idRent;
    }

    public void setIdRent(Integer idRent) {
        this.idRent = idRent;
    }

    public Date getDateRent() {
        return dateRent;
    }

    public void setDateRent(Date dateRent) {
        this.dateRent = dateRent;
    }

    public Date getDateBack() {
        return dateBack;
    }

    public void setDateBack(Date dateBack) {
        this.dateBack = dateBack;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRent != null ? idRent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rent)) {
            return false;
        }
        Rent other = (Rent) object;
        if ((this.idRent == null && other.idRent != null) || (this.idRent != null && !this.idRent.equals(other.idRent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.Rent[ idRent=" + idRent + " ]";
    }
    
}
