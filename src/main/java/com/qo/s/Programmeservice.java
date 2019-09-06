package com.qo.s;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qo.m.*;

@Service
public interface Programmeservice {

	Programme saveprogramme(Programme programme);
	
	Programme updateprogramme(Programme programme);
	
	void deleteprogramme(Programme programme);

	Programme getprogrammebyid(int id);
	List<Programme> getallprogramme();
}
