package com.qo.s;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.qo.m.Deparment;
import com.qo.respo.DeparmentRespo;
import org.springframework.stereotype.Component;


@Component
public class Deparmentimpl implements DeparmentService {

@Autowired	
DeparmentRespo deparmentrespo;	
	
	@Override
	public Deparment savedeparment(Deparment deparment) {
		// TODO Auto-generated method stub
	return deparmentrespo.save(deparment);
	}

	@Override
	public Deparment updatedeparment(Deparment deparment) {
		// TODO Auto-generated method stub
		return deparmentrespo.save(deparment);
	}

	@Override
	public void deletedeparment(Deparment deparment) {
		// TODO Auto-generated method stub
         deparmentrespo.delete(deparment);
	}

	@Override
	public List<Deparment> getalldeparment() {
		// TODO Auto-generated method stub
		return deparmentrespo.findAll();
	}

	@Override
   public Deparment getdeparmentbyid(int id) {
		return deparmentrespo.getOne(id);
	}

}
