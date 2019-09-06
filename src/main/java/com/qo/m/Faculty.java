package com.qo.m;


import java.util.List;

import javax.persistence.*;
@Entity
public class Faculty {

	@Id
	private int id;


	
    @Column(name="FacultyCode",nullable=false)
	private String Code;
	
   
    @Column(name="facultyname")
	private String facultyname;
	
    
    
    
    
    
    
    
	


	@Column(name="campus_id")
	private int campus_id;

	public int getIcd() {
		return campus_id;
	}

	public void setIcd(int icd) {
		this. campus_id= icd;
	}


	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	@JoinColumn(name = "Campus_id",nullable=false,insertable = false, updatable =false)
	@ManyToOne(fetch = FetchType.EAGER)
	private Campus campus;



    public String getFName() {
		return facultyname;
	}
	public String getCode() {
		return Code;
	}
	
	
	
	public void setFName(String facultynama) {
		facultyname = facultynama;
	}
	public void setCode(String code) {
		Code = code;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Faculty [facultyname=" + facultyname + ", Code=" + Code + ", SName=" +
				 "]";
	}

}
