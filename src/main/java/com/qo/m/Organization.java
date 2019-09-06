package com.qo.m;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
public class Organization {
  
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;    
    
    
   
   public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

@Column(name="OrganizationName")
   private String name;

	
	  public Organization(int id, String name) { super(); this.id = id; this.name =
	  name; }
	 
	  public Organization()
	  {
		  
	  }
	


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
