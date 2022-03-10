package com.hutech.model;

import com.hutech.model.Product;
import com.hutech.model.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;


@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T13:10:27")
@StaticMetamodel(Rent.class)
public class Rent_ { 

    public static volatile SingularAttribute<Rent, Integer> idRent;
    public static volatile SingularAttribute<Rent, User> idUser;
    public static volatile SingularAttribute<Rent, Integer> price;
    public static volatile SingularAttribute<Rent, Date> dateBack;
    public static volatile SingularAttribute<Rent, Product> idProduct;
    public static volatile SingularAttribute<Rent, Date> dateRent;
    public static volatile SingularAttribute<Rent, Boolean> status;

}