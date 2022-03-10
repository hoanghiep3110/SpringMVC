package com.hutech.model;

import com.hutech.model.Order;
import com.hutech.model.OrderDetailPK;
import com.hutech.model.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T15:12:24")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Product> product;
    public static volatile SingularAttribute<OrderDetail, Integer> quantity;
    public static volatile SingularAttribute<OrderDetail, Integer> price;
    public static volatile SingularAttribute<OrderDetail, Order> order1;
    public static volatile SingularAttribute<OrderDetail, OrderDetailPK> orderDetailPK;

}