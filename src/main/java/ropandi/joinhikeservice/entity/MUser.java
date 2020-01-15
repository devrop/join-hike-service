package ropandi.joinhikeservice.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import ch.qos.logback.core.db.dialect.MsSQLDialect;

/**
 *
 * @author ropandi
 */
@Entity
@Table(name = "m_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MUser.findAll", query = "SELECT m FROM MUser m")
    , @NamedQuery(name = "MUser.findById", query = "SELECT m FROM MUser m WHERE m.id = :id")
    , @NamedQuery(name = "MUser.findByName", query = "SELECT m FROM MUser m WHERE m.name = :name")
    , @NamedQuery(name = "MUser.findByEmail", query = "SELECT m FROM MUser m WHERE m.email = :email")
    , @NamedQuery(name = "MUser.findByPassword", query = "SELECT m FROM MUser m WHERE m.password = :password")
    , @NamedQuery(name = "MUser.findByBithdate", query = "SELECT m FROM MUser m WHERE m.bithdate = :bithdate")
    , @NamedQuery(name = "MUser.findByPhoneNumber", query = "SELECT m FROM MUser m WHERE m.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "MUser.findByStatus", query = "SELECT m FROM MUser m WHERE m.status = :status")
    , @NamedQuery(name = "MUser.findByCreatedDate", query = "SELECT m FROM MUser m WHERE m.createdDate = :createdDate")
    , @NamedQuery(name = "MUser.findByCreatedBy", query = "SELECT m FROM MUser m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MUser.findByUpdatedDate", query = "SELECT m FROM MUser m WHERE m.updatedDate = :updatedDate")
    , @NamedQuery(name = "MUser.findByUpdatedBy", query = "SELECT m FROM MUser m WHERE m.updatedBy = :updatedBy")
    , @NamedQuery(name = "MUser.findByActivationKey", query = "SELECT m FROM MUser m WHERE m.activationKey = :activationKey")})
public class MUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "bithdate")
    @Temporal(TemporalType.DATE)
    private Date bithdate;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "status")
    private Integer status;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "activation_key")
    private String activationKey;

    public MUser() {
    }

    public MUser(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBithdate() {
        return bithdate;
    }

    public void setBithdate(Date bithdate) {
        this.bithdate = bithdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MUser)) {
            return false;
        }
        MUser other = (MUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MUser[ id=" + id + " ]";
    }

	public MUser(String id, String name, String email, String password, Date bithdate, String phoneNumber,
			Integer status, Date createdDate, String createdBy, Date updatedDate, String updatedBy,
			String activationKey) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.bithdate = bithdate;
		this.phoneNumber = phoneNumber;
		this.status = status;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.activationKey = activationKey;
	}
    
    
    public static MUser newUser(String id, String name, String email, String password, Date bithdate, String phoneNumber,
			Integer status,String activationKey, Date createdDate, String createdBy, Date updatedDate, String updatedBy
			) {
    	MUser thi = new MUser();
    	thi.id = id;
		thi.name = name;
		thi.email = email;
		thi.password = password;
		thi.bithdate = bithdate;
		thi.phoneNumber = phoneNumber;
		thi.status = status;
		thi.createdDate = createdDate;
		thi.createdBy = createdBy;
		thi.updatedDate = updatedDate;
		thi.updatedBy = updatedBy;
		thi.activationKey = activationKey;
		return thi;
    }
    public MUser build() {
    	return new MUser(id, name, email, password, bithdate, phoneNumber, status, createdDate, createdBy, updatedDate, updatedBy, activationKey);
    }
}
