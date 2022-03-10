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
@Table(name = "class")
@NamedQueries({
    @NamedQuery(name = "Class.findAll", query = "SELECT c FROM Class c")})
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdClass")
    private Integer idClass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NameClass")
    private String nameClass;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idClass")
    private List<ImageContent> imageContentList;

    public Class() {
    }

    public Class(Integer idClass) {
        this.idClass = idClass;
    }

    public Class(Integer idClass, String nameClass) {
        this.idClass = idClass;
        this.nameClass = nameClass;
    }

    public Integer getIdClass() {
        return idClass;
    }

    public void setIdClass(Integer idClass) {
        this.idClass = idClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public List<ImageContent> getImageContentList() {
        return imageContentList;
    }

    public void setImageContentList(List<ImageContent> imageContentList) {
        this.imageContentList = imageContentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClass != null ? idClass.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Class)) {
            return false;
        }
        Class other = (Class) object;
        if ((this.idClass == null && other.idClass != null) || (this.idClass != null && !this.idClass.equals(other.idClass))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.Class[ idClass=" + idClass + " ]";
    }
    
}
