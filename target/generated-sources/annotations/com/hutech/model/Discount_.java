package com.hutech.model;

import com.hutech.model.Order;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T15:12:24")
@StaticMetamodel(Discount.class)
public class Discount_ { 

    public static volatile SingularAttribute<Discount, Integer> idDiscount;
    public static volatile SingularAttribute<Discount, String> codeDiscount;
    public static volatile ListAttribute<Discount, Order> order1List;
    public static volatile SingularAttribute<Discount, Integer> value;
    public static volatile SingularAttribute<Discount, Boolean> status;

}