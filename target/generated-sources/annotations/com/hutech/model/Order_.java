package com.hutech.model;

import com.hutech.model.Discount;
import com.hutech.model.OrderDetail;
import com.hutech.model.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T15:12:24")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, User> idUser;
    public static volatile SingularAttribute<Order, Date> dayCreate;
    public static volatile ListAttribute<Order, OrderDetail> orderDetailList;
    public static volatile SingularAttribute<Order, Discount> idDiscount;
    public static volatile SingularAttribute<Order, Integer> idOrder;
    public static volatile SingularAttribute<Order, Integer> reduceMoney;
    public static volatile SingularAttribute<Order, Integer> finalMoney;
    public static volatile SingularAttribute<Order, Integer> totalMoney;
    public static volatile SingularAttribute<Order, Short> status;
    public static volatile SingularAttribute<Order, String> momoPaymentID;

}