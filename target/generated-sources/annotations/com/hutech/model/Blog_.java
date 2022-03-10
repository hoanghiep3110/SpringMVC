package com.hutech.model;

import com.hutech.model.ImgBlog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T12:50:14")
@StaticMetamodel(Blog.class)
public class Blog_ { 

    public static volatile SingularAttribute<Blog, Integer> idBlog;
    public static volatile SingularAttribute<Blog, Integer> idUser;
    public static volatile ListAttribute<Blog, ImgBlog> imgBlogList;
    public static volatile SingularAttribute<Blog, Integer> idCate;
    public static volatile SingularAttribute<Blog, String> title;
    public static volatile SingularAttribute<Blog, Date> dateCreate;
    public static volatile SingularAttribute<Blog, String> content;

}