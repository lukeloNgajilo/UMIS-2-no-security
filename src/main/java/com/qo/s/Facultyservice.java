package com.qo.s;

import com.qo.m.Faculty;
import com.qo.m.University;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public interface Facultyservice {


    Faculty savefaculty(Faculty faculty);
    Faculty updatefaculty(Faculty faculty);
    void deletefaculty(Faculty faculty);

    Faculty getfacultybyid(int id);

    List<Faculty> getallFaculty();
}
