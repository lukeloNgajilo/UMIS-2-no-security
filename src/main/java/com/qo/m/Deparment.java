package com.qo.m;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.util.List;

@Entity
public class Deparment {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Faculty_id", nullable = false, insertable = false, updatable = false)
	private Faculty faculty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	private int id;

	@Column(name = "DeparmentName")
	private String DName;

	@Column(nullable = false)
	private String code;

	 @Column(name="HeadOfdeparment")
	 private String HOD;

	private int faculty_id;

	
	  public String getHOD() { return HOD; }
	  
	  public void setHOD(String HOD) { this.HOD = HOD; }
	 

	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public String getDName() {
		return DName;
	}

	public String getCode() {
		return code;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setDName(String dName) {
		DName = dName;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	  @Override public String toString() { return "Deparment [DName=" + DName +
	  ", code=" + code + ", HOD=" + HOD + "]"; }
	 
}
