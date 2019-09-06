package com.qo.s;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qo.m.University;
import com.qo.respo.UniversityRespo;
@Service
public class Universityimlp implements UniversityService {
     @Autowired
	UniversityRespo universityrespo;
	
	@Override
	public University saveuniversity(University university) {
		// TODO Auto-generated method stub
		return universityrespo.save(university);
	}

	@Override
	public University updateuniversity(University university) {
		// TODO Auto-generated method stub
		return universityrespo.save(university);
	}

	@Override
	public void deleteuniversity(University university) {
		// TODO Auto-generated method stub
		universityrespo.delete(university);
	}

	@Override
	public List<University>getalluniversity(){
		
		
		return universityrespo.findAll();
	}
public University getalluniversitybyId(int id) {
		//TODO Auto-generated method stub
		return universityrespo.getOne(id);

}
}
