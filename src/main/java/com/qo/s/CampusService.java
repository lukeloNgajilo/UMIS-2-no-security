package com.qo.s;

import java.util.List;

import com.qo.m.Campus;
public interface CampusService {


	Campus savecampus(Campus campus);
		
		Campus updatecampus(Campus campus);
		
		void deletecampus(Campus campus);
		   
	    List<Campus> getallCampus();
	    Campus getCampusById(int id);

	
}
