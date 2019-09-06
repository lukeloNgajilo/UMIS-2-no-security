package com.qo.m;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.NaturalId;
import org.springframework.stereotype.Component;

@Entity

public class Campus {

	@Id
	private int id;


   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
@JoinColumn(name = "University_id",nullable=false,insertable = false, updatable =false)
	@ManyToOne(fetch = FetchType.EAGER)
	private University university;



	public University getUniversity() {
	        return university;
}

public void setUniversity(University university) {
	this.university = university;
}
	@Column(name="CampusName")
	private String CName;

	@Column(nullable=false)
	private String location;
	
	@Column(nullable=false)
	private String region;
	
	@Column(nullable=false)
	private String Contacts;
	
	@Column(nullable=false)
	private String website;
	
	@Column(nullable=false)
	private String Shortname;

	@Column(name="university_id")
	private int universityid;


	public int getUniversityid() {
		return universityid;
	}

	public void setUniversityid(int universityid) {
		this.universityid = universityid;
	}

	
	public String getCName() {
		return  CName;
	}
	public String getLocation() {
		return location;
	}
	public String getRegion() {
		return region;
	}
	public String getContacts() {
		return Contacts;
	}
	public String getWebsite() {
		return website;
	}
	
	
	public String getShortname() {
		return Shortname;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setRegion(String regon) {
		region = regon;
	}
	public void setContacts(String contacts) {
		Contacts = contacts;
	}
	public void setWebsite(String wbsite) {
		website = wbsite;
	}
	
	public void setShortname(String shortName) {
		Shortname = shortName;
	}
	@Override
	public String toString() {
		return "Campus [cname=" + CName + ", location=" + location + ", region=" + region + ", Contacts=" + Contacts
				+ ", Website=" + website + ", Faculty=" + ", ShortName=" + Shortname + "]";
	}
	
}
