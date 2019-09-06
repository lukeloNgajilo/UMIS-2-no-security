package com.qo.s;

import java.util.List;

import com.qo.m.Deparment;
import org.springframework.stereotype.Component;

@Component
public interface DeparmentService {


	Deparment savedeparment(Deparment deparment);
	
	Deparment updatedeparment(Deparment deparment);
	
	void deletedeparment(Deparment deparment);
	
	List<Deparment> getalldeparment();

	Deparment getdeparmentbyid(int id);
	
}
