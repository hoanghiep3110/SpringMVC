package com.hutech.model;

import com.hutech.model.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T15:12:24")
@StaticMetamodel(Contact.class)
public class Contact_ { 

    public static volatile SingularAttribute<Contact, User> idUser;
    public static volatile SingularAttribute<Contact, Integer> idContact;
    public static volatile SingularAttribute<Contact, String> title;
    public static volatile SingularAttribute<Contact, String> email;
    public static volatile SingularAttribute<Contact, String> content;
    public static volatile SingularAttribute<Contact, Boolean> status;

}