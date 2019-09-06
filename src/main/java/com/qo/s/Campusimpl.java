package com.qo.s;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qo.m.Campus;
import com.qo.respo.CampusRespo;

@Component
public class Campusimpl implements CampusService {

@Autowired
CampusRespo campusRespo;	
	
	@Override
	public Campus savecampus(Campus campus) {
		// TODO Auto-generated method stub
		return campusRespo.save(campus);
	}

	@Override
	public Campus updatecampus(Campus campus) {
		// TODO Auto-generated method stub
		return campusRespo.save(campus);
	}

	@Override
	public void deletecampus(Campus campus) {
		// TODO Auto-generated method stub
         campusRespo.delete(campus);
	}

	@Override
	public List<Campus> getallCampus() {
		// TODO Auto-generated method stub
		return campusRespo.findAll();
	}

	@Override
	public Campus getCampusById(int id) {
		return campusRespo.getOne(id);
	}

}
