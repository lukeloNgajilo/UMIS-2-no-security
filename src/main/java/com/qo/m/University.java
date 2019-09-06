package com.qo.m;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class University {
	

	@Id
	private int id;
	
	@Column(name="Universityname",nullable=false)
	private String uname;
	
	@Column(name="location",nullable=false)
	private String location;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name="campus",nullable=false)
     private String Campus;
	
	@Column(name="website",nullable=false)
	private String Website;
    
	@Column(name="PostalAddress",nullable=false)
	private String PAddress;
	
    @Column(name="NumberOfcampus")
    private String ncampus;
	
    @Column(name="contacts",nullable=false)
    private String Contacts;

   private int organization_id;
    
    
    
    public int getOrganization_id() {
	return organization_id;
   }
   public void setOrganization_id(int organization_id) {
	this.organization_id = organization_id;
    }

	@JoinColumn(name = "Organization_id",nullable=false,insertable = false, updatable =false)
	@ManyToOne(fetch = FetchType.EAGER)
	private Organization organization;

   
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String unme) {
		uname = unme;
	}
	
	
	public String getLocation() {
		return location;
	}
	public String getCampus() {
		return Campus;
	}
	public String getWebsite() {
		return Website;
	}
	public String getPAddress() {
		return PAddress;
	}
	public String getNcampus() {
		return ncampus;
	}
	public String getContacts() {
		return Contacts;
	}
	
	
	public void setLocation(String locatio) {
		location = locatio;
	}
	public void setCampus(String campus) {
		
		Campus = campus;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public void setPAddress(String pAddress) {
		PAddress = pAddress;
	}
	public void setNcampus(String nampus) {
		ncampus = nampus;
	}
	public void setContacts(String contacts) {
		Contacts = contacts;
	}
	
	@Override
	public String toString() {
		return "University [uname=" + uname + ", Otype=" + ", location=" + location + ", Campus=" + Campus
				+ ", Website=" + Website + ", PAddress=" + PAddress + ", ncampus=" + ncampus + ", Contacts=" + Contacts
				+ "]";
	}

}
