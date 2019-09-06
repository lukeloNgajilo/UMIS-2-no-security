package com.qo.m;

import javax.persistence.*;

@Entity
public class Programme {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="ProgrammeName")
	private String name;

	public String getName() {
		return name;
	}



	@Column(name="location")
	private String code;
	
	@Column(name="ProgrammeType")
	private String Otype;
	
	public String getOtype() {
		return Otype;
	}

	public void setOtype(String otype) {
		Otype = otype;
	}



	@Column(name="ProgrammeShortname")
	private String ShortName;
	
	@Column(name="DurationofProgramme")
	private String Year;
	
	
	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}



	@Column()
	private int deparment_id;

	public int getDeparmentid() {
		return deparment_id;
	}

	public void setDeparmentid(int deparmentid) {
		this.deparment_id = deparmentid;
	}



	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="Deparment_id",nullable=false,insertable = false, updatable =false)
	private Deparment deparment;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Deparment getDeparment() {
		return deparment;
	}

	public void setDeparment(Deparment deparment) {
		this.deparment = deparment;
	}

	public String getCode() {
		return code;
	}
	
	public String getIntervals() {
		return Year;
	}
	public String getname() {
		return name;
	}
	public String getShortName() {
		return ShortName;
	}
	public String getType() {
		return Otype;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setIntervals(String intervals) {
		this.Year = intervals;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setShortName(String shortName) {
		ShortName = shortName;
	}
	public void setType(String type) {
		this.Otype = type;
	}
	@Override
	public String toString() {
		return "Programmer [name=" + name + ", code=" + code + ", type=" + Otype + ", ShortName=" + ShortName
				+ ", intervals=" + Year +    "]";
	}
	
}
