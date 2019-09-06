package com.qo.s;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qo.m.Programme;
import com.qo.respo.Programmerespo;
@Component
public class Programmeimpl implements Programmeservice {
 
	@Autowired
	Programmerespo programmerespo;
	
	@Override
	public Programme saveprogramme(Programme programme) {
		return programmerespo.save(programme);
	}

	@Override
	public Programme updateprogramme(Programme programme) {
		// TODO Auto-generated method stub
		return programmerespo.save(programme);
	}

	@Override
	public void deleteprogramme(Programme programme) {
		// TODO Auto-generated method stub
            programmerespo.delete(programme);
	}

    @Override
    public Programme getprogrammebyid(int id) {
        return programmerespo.getOne(id);
    }

    @Override
	public List<Programme> getallprogramme() {
		// TODO Auto-generated method stub
		return programmerespo.findAll();
	}

}
