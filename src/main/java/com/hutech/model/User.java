/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hutech.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Hiệp Phan
 */
@Entity
@Table(name = "user")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdUser")
    private Integer idUser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "FullName")
    private String fullName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Address")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Host")
    private String host;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "User")
    private String user;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Password")
    private String password1;
    @Size(max = 1)
    @Column(name = "Select_priv")
    private String selectpriv;
    @Size(max = 1)
    @Column(name = "Insert_priv")
    private String insertpriv;
    @Size(max = 1)
    @Column(name = "Update_priv")
    private String updatepriv;
    @Size(max = 1)
    @Column(name = "Delete_priv")
    private String deletepriv;
    @Size(max = 1)
    @Column(name = "Create_priv")
    private String createpriv;
    @Size(max = 1)
    @Column(name = "Drop_priv")
    private String droppriv;
    @Size(max = 1)
    @Column(name = "Reload_priv")
    private String reloadpriv;
    @Size(max = 1)
    @Column(name = "Shutdown_priv")
    private String shutdownpriv;
    @Size(max = 1)
    @Column(name = "Process_priv")
    private String processpriv;
    @Size(max = 1)
    @Column(name = "File_priv")
    private String filepriv;
    @Size(max = 1)
    @Column(name = "Grant_priv")
    private String grantpriv;
    @Size(max = 1)
    @Column(name = "References_priv")
    private String referencespriv;
    @Size(max = 1)
    @Column(name = "Index_priv")
    private String indexpriv;
    @Size(max = 1)
    @Column(name = "Alter_priv")
    private String alterpriv;
    @Size(max = 1)
    @Column(name = "Show_db_priv")
    private String showdbpriv;
    @Size(max = 1)
    @Column(name = "Super_priv")
    private String superpriv;
    @Size(max = 1)
    @Column(name = "Create_tmp_table_priv")
    private String createtmptablepriv;
    @Size(max = 1)
    @Column(name = "Lock_tables_priv")
    private String locktablespriv;
    @Size(max = 1)
    @Column(name = "Execute_priv")
    private String executepriv;
    @Size(max = 1)
    @Column(name = "Repl_slave_priv")
    private String replslavepriv;
    @Size(max = 1)
    @Column(name = "Repl_client_priv")
    private String replclientpriv;
    @Size(max = 1)
    @Column(name = "Create_view_priv")
    private String createviewpriv;
    @Size(max = 1)
    @Column(name = "Show_view_priv")
    private String showviewpriv;
    @Size(max = 1)
    @Column(name = "Create_routine_priv")
    private String createroutinepriv;
    @Size(max = 1)
    @Column(name = "Alter_routine_priv")
    private String alterroutinepriv;
    @Size(max = 1)
    @Column(name = "Create_user_priv")
    private String createuserpriv;
    @Size(max = 1)
    @Column(name = "Event_priv")
    private String eventpriv;
    @Size(max = 1)
    @Column(name = "Trigger_priv")
    private String triggerpriv;
    @Size(max = 1)
    @Column(name = "Create_tablespace_priv")
    private String createtablespacepriv;
    @Size(max = 1)
    @Column(name = "Delete_history_priv")
    private String deletehistorypriv;
    @Size(max = 9)
    @Column(name = "ssl_type")
    private String sslType;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "ssl_cipher")
    private String sslCipher;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "x509_issuer")
    private String x509Issuer;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "x509_subject")
    private String x509Subject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_questions")
    private long maxQuestions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_updates")
    private long maxUpdates;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_connections")
    private long maxConnections;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_user_connections")
    private long maxUserConnections;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "plugin")
    private String plugin;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "authentication_string")
    private String authenticationString;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "password_expired")
    private String passwordExpired;
    @Size(max = 1)
    @Column(name = "is_role")
    private String isRole;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "default_role")
    private String defaultRole;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_statement_time")
    private BigDecimal maxStatementTime;
    @OneToMany(mappedBy = "idUser")
    private Collection<Contact> contactCollection;
    @JoinColumn(name = "IdRole", referencedColumnName = "IdRole")
    @ManyToOne(optional = false)
    private UserRole idRole;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private Collection<Order> order1Collection;

    public User() {
    }

    public User(Integer idUser) {
        this.idUser = idUser;
    }
    
    public User(String fullName, String email, String username, String password, String address, String phone){
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    public User(Integer idUser, String fullName, String email, String username, String password, String address, String phone, String host, String user, String sslCipher, String x509Issuer, String x509Subject, long maxQuestions, long maxUpdates, long maxConnections, long maxUserConnections, String plugin, String authenticationString, String passwordExpired, String defaultRole, BigDecimal maxStatementTime) {
        this.idUser = idUser;
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.host = host;
        this.user = user;
        this.sslCipher = sslCipher;
        this.x509Issuer = x509Issuer;
        this.x509Subject = x509Subject;
        this.maxQuestions = maxQuestions;
        this.maxUpdates = maxUpdates;
        this.maxConnections = maxConnections;
        this.maxUserConnections = maxUserConnections;
        this.plugin = plugin;
        this.authenticationString = authenticationString;
        this.passwordExpired = passwordExpired;
        this.defaultRole = defaultRole;
        this.maxStatementTime = maxStatementTime;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getSelectpriv() {
        return selectpriv;
    }

    public void setSelectpriv(String selectpriv) {
        this.selectpriv = selectpriv;
    }

    public String getInsertpriv() {
        return insertpriv;
    }

    public void setInsertpriv(String insertpriv) {
        this.insertpriv = insertpriv;
    }

    public String getUpdatepriv() {
        return updatepriv;
    }

    public void setUpdatepriv(String updatepriv) {
        this.updatepriv = updatepriv;
    }

    public String getDeletepriv() {
        return deletepriv;
    }

    public void setDeletepriv(String deletepriv) {
        this.deletepriv = deletepriv;
    }

    public String getCreatepriv() {
        return createpriv;
    }

    public void setCreatepriv(String createpriv) {
        this.createpriv = createpriv;
    }

    public String getDroppriv() {
        return droppriv;
    }

    public void setDroppriv(String droppriv) {
        this.droppriv = droppriv;
    }

    public String getReloadpriv() {
        return reloadpriv;
    }

    public void setReloadpriv(String reloadpriv) {
        this.reloadpriv = reloadpriv;
    }

    public String getShutdownpriv() {
        return shutdownpriv;
    }

    public void setShutdownpriv(String shutdownpriv) {
        this.shutdownpriv = shutdownpriv;
    }

    public String getProcesspriv() {
        return processpriv;
    }

    public void setProcesspriv(String processpriv) {
        this.processpriv = processpriv;
    }

    public String getFilepriv() {
        return filepriv;
    }

    public void setFilepriv(String filepriv) {
        this.filepriv = filepriv;
    }

    public String getGrantpriv() {
        return grantpriv;
    }

    public void setGrantpriv(String grantpriv) {
        this.grantpriv = grantpriv;
    }

    public String getReferencespriv() {
        return referencespriv;
    }

    public void setReferencespriv(String referencespriv) {
        this.referencespriv = referencespriv;
    }

    public String getIndexpriv() {
        return indexpriv;
    }

    public void setIndexpriv(String indexpriv) {
        this.indexpriv = indexpriv;
    }

    public String getAlterpriv() {
        return alterpriv;
    }

    public void setAlterpriv(String alterpriv) {
        this.alterpriv = alterpriv;
    }

    public String getShowdbpriv() {
        return showdbpriv;
    }

    public void setShowdbpriv(String showdbpriv) {
        this.showdbpriv = showdbpriv;
    }

    public String getSuperpriv() {
        return superpriv;
    }

    public void setSuperpriv(String superpriv) {
        this.superpriv = superpriv;
    }

    public String getCreatetmptablepriv() {
        return createtmptablepriv;
    }

    public void setCreatetmptablepriv(String createtmptablepriv) {
        this.createtmptablepriv = createtmptablepriv;
    }

    public String getLocktablespriv() {
        return locktablespriv;
    }

    public void setLocktablespriv(String locktablespriv) {
        this.locktablespriv = locktablespriv;
    }

    public String getExecutepriv() {
        return executepriv;
    }

    public void setExecutepriv(String executepriv) {
        this.executepriv = executepriv;
    }

    public String getReplslavepriv() {
        return replslavepriv;
    }

    public void setReplslavepriv(String replslavepriv) {
        this.replslavepriv = replslavepriv;
    }

    public String getReplclientpriv() {
        return replclientpriv;
    }

    public void setReplclientpriv(String replclientpriv) {
        this.replclientpriv = replclientpriv;
    }

    public String getCreateviewpriv() {
        return createviewpriv;
    }

    public void setCreateviewpriv(String createviewpriv) {
        this.createviewpriv = createviewpriv;
    }

    public String getShowviewpriv() {
        return showviewpriv;
    }

    public void setShowviewpriv(String showviewpriv) {
        this.showviewpriv = showviewpriv;
    }

    public String getCreateroutinepriv() {
        return createroutinepriv;
    }

    public void setCreateroutinepriv(String createroutinepriv) {
        this.createroutinepriv = createroutinepriv;
    }

    public String getAlterroutinepriv() {
        return alterroutinepriv;
    }

    public void setAlterroutinepriv(String alterroutinepriv) {
        this.alterroutinepriv = alterroutinepriv;
    }

    public String getCreateuserpriv() {
        return createuserpriv;
    }

    public void setCreateuserpriv(String createuserpriv) {
        this.createuserpriv = createuserpriv;
    }

    public String getEventpriv() {
        return eventpriv;
    }

    public void setEventpriv(String eventpriv) {
        this.eventpriv = eventpriv;
    }

    public String getTriggerpriv() {
        return triggerpriv;
    }

    public void setTriggerpriv(String triggerpriv) {
        this.triggerpriv = triggerpriv;
    }

    public String getCreatetablespacepriv() {
        return createtablespacepriv;
    }

    public void setCreatetablespacepriv(String createtablespacepriv) {
        this.createtablespacepriv = createtablespacepriv;
    }

    public String getDeletehistorypriv() {
        return deletehistorypriv;
    }

    public void setDeletehistorypriv(String deletehistorypriv) {
        this.deletehistorypriv = deletehistorypriv;
    }

    public String getSslType() {
        return sslType;
    }

    public void setSslType(String sslType) {
        this.sslType = sslType;
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    public String getX509Issuer() {
        return x509Issuer;
    }

    public void setX509Issuer(String x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    public String getX509Subject() {
        return x509Subject;
    }

    public void setX509Subject(String x509Subject) {
        this.x509Subject = x509Subject;
    }

    public long getMaxQuestions() {
        return maxQuestions;
    }

    public void setMaxQuestions(long maxQuestions) {
        this.maxQuestions = maxQuestions;
    }

    public long getMaxUpdates() {
        return maxUpdates;
    }

    public void setMaxUpdates(long maxUpdates) {
        this.maxUpdates = maxUpdates;
    }

    public long getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(long maxConnections) {
        this.maxConnections = maxConnections;
    }

    public long getMaxUserConnections() {
        return maxUserConnections;
    }

    public void setMaxUserConnections(long maxUserConnections) {
        this.maxUserConnections = maxUserConnections;
    }

    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    public String getAuthenticationString() {
        return authenticationString;
    }

    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString;
    }

    public String getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(String passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public String getIsRole() {
        return isRole;
    }

    public void setIsRole(String isRole) {
        this.isRole = isRole;
    }

    public String getDefaultRole() {
        return defaultRole;
    }

    public void setDefaultRole(String defaultRole) {
        this.defaultRole = defaultRole;
    }

    public BigDecimal getMaxStatementTime() {
        return maxStatementTime;
    }

    public void setMaxStatementTime(BigDecimal maxStatementTime) {
        this.maxStatementTime = maxStatementTime;
    }

    public Collection<Contact> getContactCollection() {
        return contactCollection;
    }

    public void setContactCollection(Collection<Contact> contactCollection) {
        this.contactCollection = contactCollection;
    }

    public UserRole getIdRole() {
        return idRole;
    }

    public void setIdRole(UserRole idRole) {
        this.idRole = idRole;
    }

    public Collection<Order> getOrder1Collection() {
        return order1Collection;
    }

    public void setOrder1Collection(Collection<Order> order1Collection) {
        this.order1Collection = order1Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hutech.model.User[ idUser=" + idUser + " ]";
    }
    
}
