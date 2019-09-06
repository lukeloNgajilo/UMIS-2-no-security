package com.qo.C;


import com.qo.m.Campus;
import com.qo.m.Deparment;
import com.qo.m.Faculty;
import com.qo.m.University;
import com.qo.s.CampusService;
import com.qo.s.DeparmentService;
import com.qo.s.Facultyservice;
import com.qo.s.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DeparmentController {


    @Autowired
    UniversityService universityService;

    @Autowired
    CampusService campusService;

    @Autowired
    Facultyservice facultyservice;

    @Autowired
    DeparmentService deparmentservice;


	
	  @RequestMapping("/deparment") public String index()
	 
	 {
	 
	  
	 return "redirect:/viewdeparment"; }
	 
	








@RequestMapping("/adddeparment")
public String adddeparment(ModelMap modelmap )
{
    List<University>university=universityService.getalluniversity();
    List<Campus>campus=campusService.getallCampus();
    List<Faculty>faculty=facultyservice.getallFaculty();
    modelmap.addAttribute("university",university);
    modelmap.addAttribute("faculty",faculty);
    modelmap.addAttribute("campus",campus);
    modelmap.addAttribute("university",university);
    return "deparmenta";
}

 @RequestMapping("/viewdeparment")
public String viewdeparment(ModelMap modelmap,Deparment depa)
 {
     List<University>university=universityService.getalluniversity();
     List<Campus>campus=campusService.getallCampus();
     List<Faculty>faculty=facultyservice.getallFaculty();
  
     List<Deparment>deparment=deparmentservice.getalldeparment();
   // depa.getfaculty().getUniversity().getUname();
     modelmap.addAttribute("university",university);
     modelmap.addAttribute("faculty",faculty);
     modelmap.addAttribute("university",university);
     modelmap.addAttribute("campus",campus);
     modelmap.addAttribute("deparment",deparment);

     return"deparment2";
 }

 
 @RequestMapping("/viewdeparments")
 public String viewdeparments(ModelMap modelmap,Deparment depa)
  {
      List<University>university=universityService.getalluniversity();
      List<Campus>campus=campusService.getallCampus();
      List<Faculty>faculty=facultyservice.getallFaculty();
   
      List<Deparment>deparment=deparmentservice.getalldeparment();
    // depa.getfaculty().getUniversity().getUname();
      modelmap.addAttribute("university",university);
      modelmap.addAttribute("faculty",faculty);
      modelmap.addAttribute("university",university);
      modelmap.addAttribute("campus",campus);
      modelmap.addAttribute("deparment",deparment);

      return"deparment";
  }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 @RequestMapping("/savedeparment")
 public String savedeparment(@ModelAttribute("deparment")Deparment deparment, ModelMap model, @RequestParam("campus") String c,
		 @RequestParam("university") String b,@RequestParam("faculty")String a,Faculty faculty,Campus campus,@RequestParam("DName") String o) {
    int z = Integer.parseInt(c);
    int y = Integer.parseInt(b);
    int v = Integer.parseInt(a);
    deparment.setDName(o);
    deparment.setFaculty_id(v);
    faculty.setIcd(z);
    campus.setUniversityid(y);
    deparmentservice.savedeparment(deparment);

    return "redirect:/viewdeparment";

}

@RequestMapping("/editdeparment")
    public String editdeparment(ModelMap modelmap,@RequestParam("id")int x)
    {
       Deparment deparment= deparmentservice.getdeparmentbyid(x);
        List<University>university=universityService.getalluniversity();
        List<Campus>campus=campusService.getallCampus();
        List<Faculty>faculty=facultyservice.getallFaculty();
        modelmap.addAttribute("university",university);
        modelmap.addAttribute("faculty",faculty);
        modelmap.addAttribute("university",university);
        modelmap.addAttribute("campus",campus);
       modelmap.addAttribute("deparment",deparment);


        return"deparment3";
    }

  
@RequestMapping("/deletedeparment")
    public String deletedeparment(@RequestParam("id")int z ,ModelMap modelmap)
  {
      Deparment deparment =deparmentservice.getdeparmentbyid(z);
      deparmentservice.deletedeparment(deparment);;

      return"redirect:/viewdeparment";
  }



}



