/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "img_blog")
@NamedQueries({
    @NamedQuery(name = "ImgBlog.findAll", query = "SELECT i FROM ImgBlog i")})
public class ImgBlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdImg")
    private Integer idImg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "AltImg")
    private String altImg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "LinkImg")
    private String linkImg;
    @JoinColumn(name = "IdBlog", referencedColumnName = "IdBlog")
    @ManyToOne
    private Blog idBlog;

    public ImgBlog() {
    }

    public ImgBlog(Integer idImg) {
        this.idImg = idImg;
    }

    public ImgBlog(Integer idImg, String altImg, String linkImg) {
        this.idImg = idImg;
        this.altImg = altImg;
        this.linkImg = linkImg;
    }

    public Integer getIdImg() {
        return idImg;
    }

    public void setIdImg(Integer idImg) {
        this.idImg = idImg;
    }

    public String getAltImg() {
        return altImg;
    }

    public void setAltImg(String altImg) {
        this.altImg = altImg;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public Blog getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Blog idBlog) {
        this.idBlog = idBlog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idImg != null ? idImg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImgBlog)) {
            return false;
        }
        ImgBlog other = (ImgBlog) object;
        if ((this.idImg == null && other.idImg != null) || (this.idImg != null && !this.idImg.equals(other.idImg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.ImgBlog[ idImg=" + idImg + " ]";
    }
    
}
