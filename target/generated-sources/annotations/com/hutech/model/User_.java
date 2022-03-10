package com.hutech.model;

import com.hutech.model.Contact;
import com.hutech.model.Order;
import com.hutech.model.Rent;
import com.hutech.model.UserRole;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-03-10T13:10:27")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> processpriv;
    public static volatile SingularAttribute<User, String> createpriv;
    public static volatile SingularAttribute<User, String> x509Subject;
    public static volatile SingularAttribute<User, String> reloadpriv;
    public static volatile SingularAttribute<User, String> executepriv;
    public static volatile SingularAttribute<User, Date> dayCreate;
    public static volatile SingularAttribute<User, String> updatepriv;
    public static volatile SingularAttribute<User, String> triggerpriv;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> alterroutinepriv;
    public static volatile SingularAttribute<User, String> host;
    public static volatile ListAttribute<User, Order> order1List;
    public static volatile SingularAttribute<User, String> grantpriv;
    public static volatile SingularAttribute<User, String> filepriv;
    public static volatile SingularAttribute<User, String> superpriv;
    public static volatile ListAttribute<User, Rent> rentList;
    public static volatile SingularAttribute<User, String> defaultRole;
    public static volatile SingularAttribute<User, String> eventpriv;
    public static volatile SingularAttribute<User, String> sslType;
    public static volatile SingularAttribute<User, String> createviewpriv;
    public static volatile SingularAttribute<User, Long> maxQuestions;
    public static volatile ListAttribute<User, Contact> contactList;
    public static volatile SingularAttribute<User, String> createtmptablepriv;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, Long> maxUpdates;
    public static volatile SingularAttribute<User, String> createuserpriv;
    public static volatile SingularAttribute<User, String> replclientpriv;
    public static volatile SingularAttribute<User, String> insertpriv;
    public static volatile SingularAttribute<User, BigDecimal> maxStatementTime;
    public static volatile SingularAttribute<User, String> deletehistorypriv;
    public static volatile SingularAttribute<User, Integer> idUser;
    public static volatile SingularAttribute<User, String> alterpriv;
    public static volatile SingularAttribute<User, String> droppriv;
    public static volatile SingularAttribute<User, String> password1;
    public static volatile SingularAttribute<User, String> showdbpriv;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Long> maxUserConnections;
    public static volatile SingularAttribute<User, Long> maxConnections;
    public static volatile SingularAttribute<User, String> deletepriv;
    public static volatile SingularAttribute<User, String> shutdownpriv;
    public static volatile SingularAttribute<User, String> showviewpriv;
    public static volatile SingularAttribute<User, String> sslCipher;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, String> replslavepriv;
    public static volatile SingularAttribute<User, UserRole> idRole;
    public static volatile SingularAttribute<User, String> isRole;
    public static volatile SingularAttribute<User, String> fullName;
    public static volatile SingularAttribute<User, String> locktablespriv;
    public static volatile SingularAttribute<User, String> indexpriv;
    public static volatile SingularAttribute<User, String> createroutinepriv;
    public static volatile SingularAttribute<User, String> referencespriv;
    public static volatile SingularAttribute<User, String> x509Issuer;
    public static volatile SingularAttribute<User, String> selectpriv;
    public static volatile SingularAttribute<User, String> createtablespacepriv;
    public static volatile SingularAttribute<User, String> plugin;
    public static volatile SingularAttribute<User, String> authenticationString;
    public static volatile SingularAttribute<User, String> passwordExpired;
    public static volatile SingularAttribute<User, String> user;
    public static volatile SingularAttribute<User, String> username;

}