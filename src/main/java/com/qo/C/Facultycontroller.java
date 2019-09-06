package com.qo.C;

import com.qo.m.Campus;
import com.qo.m.Faculty;
import com.qo.m.Organization;
import com.qo.m.University;
import com.qo.s.CampusService;
import com.qo.s.Facultyservice;
import com.qo.s.OrganizationService;
import com.qo.s.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Facultycontroller {

 
    
    @Autowired
    UniversityService universityService;
 
    @Autowired
    CampusService Campusservice;
    
    @Autowired
    Facultyservice facultyservice;




    @RequestMapping("/addfaculty")
    public String index(ModelMap modelmap)
    {
        List<Campus>campus=Campusservice.getallCampus();
        List<University>university=universityService.getalluniversity();
        modelmap.addAttribute("university",university);
        modelmap.addAttribute("campus",campus);

        return"facultya";
    }






	
	  @RequestMapping("/faculty") 
	  public String fa() {
	
	  return "redirect:/viewfaculty";
	  
	  }
	 

    

    @RequestMapping("/viewfacultys")
    public String viewFacultys(ModelMap modelmap)
{  List<University>university=universityService.getalluniversity();

List<Faculty>faculty=facultyservice.getallFaculty();
 

//   Faculty  facultzy=faculty

      List<Campus>campus=Campusservice.getallCampus();

modelmap.addAttribute("campus",campus);
 
modelmap.addAttribute("faculty",faculty);
modelmap.addAttribute("university",university);

return "faculty";
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

        @RequestMapping("/viewfaculty")
        public String viewFaculty(ModelMap modelmap)
{  List<University>university=universityService.getalluniversity();

    List<Faculty>faculty=facultyservice.getallFaculty();
     
    
   //   Faculty  facultzy=faculty
 
          List<Campus>campus=Campusservice.getallCampus();
    
    modelmap.addAttribute("campus",campus);
     
    modelmap.addAttribute("faculty",faculty);
    modelmap.addAttribute("university",university);

   return "faculty2";
}

    @RequestMapping("/editfaculty")
    public String editFaculty(@RequestParam("id")int b, ModelMap modelMap)
{
     Faculty faculty=facultyservice.getfacultybyid(b);
    List<University>university=universityService.getalluniversity();

     List<Campus>campus= Campusservice.getallCampus();
                 String a=faculty.getFName();
      modelMap.addAttribute("faculty",faculty);
      modelMap.addAttribute("campus",campus);
      modelMap.addAttribute("university",university);
      modelMap.addAttribute("a",a);

        return "faculty3";
}

    @RequestMapping("/deletefaculty")
    public String deleteFaculty(@RequestParam("id")int a)
{
          Faculty faculty=facultyservice.getfacultybyid(a);
                     facultyservice.deletefaculty(faculty);


    return  "redirect:/viewfaculty";
}
        @RequestMapping("/savefaculty")
        public String saveFaculty(@RequestParam("facultyname")String s,
        		@ModelAttribute("faculty")Faculty faculty,@RequestParam("campus")String c,
        		@RequestParam("university")String v ,Campus campus)
        {
            int a=Integer.parseInt(c);
            int b=Integer.parseInt(v);

            campus.setUniversityid(b);
            faculty.setIcd(a);
            
            
            faculty.setFName(s);
            
            facultyservice.savefaculty(faculty);
            Campusservice.savecampus(campus);


            return"redirect:/viewfaculty";
        }



}
