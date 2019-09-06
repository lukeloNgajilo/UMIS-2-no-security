package com.qo.s;

import java.util.List;
import java.util.Optional;

import com.qo.m.*;


public interface UniversityService {
	
	University saveuniversity(University university);
	
University updateuniversity(University university);
	
	void deleteuniversity(University university);
	 University getalluniversitybyId(int id);
    List <University> getalluniversity();

}
