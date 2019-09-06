package com.qo.s;

import com.qo.m.Faculty;
import com.qo.respo.Facultyrespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FacultyserviceImpl implements Facultyservice {

   @Autowired
    Facultyrespo facultyrespo;



    @Override
    public Faculty savefaculty(Faculty faculty) {
        return facultyrespo.save(faculty);
    }

    @Override
    public Faculty updatefaculty(Faculty faculty) {
        return facultyrespo.save(faculty);
    }

    @Override
    public void deletefaculty(Faculty faculty) {
       facultyrespo.delete(faculty);
    }

    @Override
    public Faculty getfacultybyid(int id) {
        return facultyrespo.getOne(id);
    }

    @Override
    public List<Faculty> getallFaculty() {
        return facultyrespo.findAll();
    }



}
