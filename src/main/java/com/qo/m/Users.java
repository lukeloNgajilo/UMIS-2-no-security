package com.qo.m;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.dom4j.tree.AbstractEntity;
import org.hibernate.annotations.DynamicUpdate;


import java.time.chrono.AbstractChronology;
import java.util.Set;


@Entity
@Table(name="Users")
public class Users {

	@Id
	private  int id;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="Name",nullable=false)
	private  String name;

	@Column(name="telephone",nullable=false)
	private String Telephone;

	@Column(name="Password",nullable=false)
	private String password;


	@Column(nullable=false)
	private String email;

	
	
	public Users(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}









	public Users() {
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User ["+ "name=" + name + ", password=" + password + ", email=" + email + "]";
	}

	
}
