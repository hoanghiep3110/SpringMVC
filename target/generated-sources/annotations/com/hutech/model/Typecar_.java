package com.hutech.model;

import com.hutech.model.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T15:12:24")
@StaticMetamodel(Typecar.class)
public class Typecar_ { 

    public static volatile SingularAttribute<Typecar, String> nameType;
    public static volatile SingularAttribute<Typecar, Integer> idType;
    public static volatile ListAttribute<Typecar, Product> productList;
    public static volatile SingularAttribute<Typecar, String> imgType;

}