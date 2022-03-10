package com.hutech.model;

import com.hutech.model.Brand;
import com.hutech.model.ImgProduct;
import com.hutech.model.OrderDetail;
import com.hutech.model.Rent;
import com.hutech.model.Typecar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T12:50:14")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile ListAttribute<Product, Rent> rentList;
    public static volatile ListAttribute<Product, OrderDetail> orderDetailList;
    public static volatile ListAttribute<Product, ImgProduct> imgProductList;
    public static volatile SingularAttribute<Product, Typecar> idType;
    public static volatile SingularAttribute<Product, Integer> price;
    public static volatile SingularAttribute<Product, Brand> idBrand;
    public static volatile SingularAttribute<Product, Integer> idProduct;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, String> nameProduct;
    public static volatile SingularAttribute<Product, Integer> status;

}