/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hiệp Phan
 */
@Entity
@Table(name = "blog")
@NamedQueries({
    @NamedQuery(name = "Blog.findAll", query = "SELECT b FROM Blog b")})
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdBlog")
    private Integer idBlog;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdCate")
    private int idCate;
    @Size(max = 255)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IdUser")
    private int idUser;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Content")
    private String content;
    @Size(max = 400)
    @Column(name = "LinkImg")
    private String linkImg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @OneToMany(mappedBy = "idBlog")
    private Collection<ImgBlog> imgBlogCollection;

    public Blog() {
    }

    public Blog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public Blog(Integer idBlog, int idCate, String title, int idUser, String content, String linkImg, Date dateCreate) {
        this.idBlog = idBlog;
        this.idCate = idCate;
        this.title = title;
        this.idUser = idUser;
        this.content = content;
        this.linkImg = linkImg;
        this.dateCreate = dateCreate;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
    }

    public int getIdCate() {
        return idCate;
    }

    public void setIdCate(int idCate) {
        this.idCate = idCate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Collection<ImgBlog> getImgBlogCollection() {
        return imgBlogCollection;
    }

    public void setImgBlogCollection(Collection<ImgBlog> imgBlogCollection) {
        this.imgBlogCollection = imgBlogCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBlog != null ? idBlog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blog)) {
            return false;
        }
        Blog other = (Blog) object;
        if ((this.idBlog == null && other.idBlog != null) || (this.idBlog != null && !this.idBlog.equals(other.idBlog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.Blog[ idBlog=" + idBlog + " ]";
    }
    
}
