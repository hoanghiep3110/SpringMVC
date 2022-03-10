package com.hutech.model;

import com.hutech.model.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T13:10:27")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile ListAttribute<UserRole, User> userList;
    public static volatile SingularAttribute<UserRole, Integer> idRole;
    public static volatile SingularAttribute<UserRole, String> roleName;

}