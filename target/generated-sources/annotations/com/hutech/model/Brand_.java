package com.hutech.model;

import com.hutech.model.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T15:12:24")
@StaticMetamodel(Brand.class)
public class Brand_ { 

    public static volatile SingularAttribute<Brand, Integer> idBrand;
    public static volatile SingularAttribute<Brand, String> imgBrand;
    public static volatile SingularAttribute<Brand, String> nameBrand;
    public static volatile ListAttribute<Brand, Product> productList;

}