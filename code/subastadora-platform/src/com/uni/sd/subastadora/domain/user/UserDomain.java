package com.uni.sd.subastadora.domain.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.uni.sd.subastadora.domain.base.BaseDomain;
import com.uni.sd.subastadora.domain.location.city.CityDomain;
import com.uni.sd.subastadora.domain.location.country.CountryDomain;

@Entity
@Table(name = "state")
public class UserDomain extends BaseDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true)
	private Integer _id;

	@Column(name = "name")
	private String _name;

	@Column(name = "username")
	private String _username;
	@Column(name = "lastname")
	private String _lastname;	
	
	@Column(name = "email")
	private String _email;
	
	@Column(name = "address")
	private String _address;
	
	@Column(name = "password")
	private String _password;
	
	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getLastName() {
		return _lastname;
	}

	public void setLastName(String name) {
		_lastname = name;
	}
	
	public String getUserName() {
		return _username;
	}

	public void setUserName(String name) {
		_username = name;
	}
	
	public String getEmail() {
		return _email;
	}

	public void setEmail(String name) {
		_email = name;
	}	
	

	public String getaddress() {
		return _address;
	}

	public void setAddress(String name) {
		_address = name;
	}

}