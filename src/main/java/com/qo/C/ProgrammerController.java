package com.qo.C;

import com.qo.m.*;
import com.qo.s.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class ProgrammerController {

	@Autowired
	Programmeservice programmeservice;

	@Autowired
	UniversityService universityService;

	@Autowired
	CampusService campusService;

	@Autowired
	DeparmentService deparmentService;

	@Autowired
	Facultyservice facultyservice;




	@RequestMapping("/addprogramme")
   public String addprogramme(ModelMap modelmap)
	{

		List<University> university=universityService.getalluniversity();
		List<Campus>campus=campusService.getallCampus();
		List<Faculty>faculty=facultyservice.getallFaculty();
		List<Deparment>deparment=deparmentService.getalldeparment();
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("faculty",faculty);
		modelmap.addAttribute("campus",campus);
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("deparment",deparment);


		return"programmea";
	}
	
	
	
	
	

	
	  @RequestMapping("/programme")
	  public String indexprogramme() {
	  
	  return"redirect:/viewprogramme"; }
	  
	 
	
	
	
	
	
	
	@RequestMapping("/saveprogramme")
	public String saveprogramme(@ModelAttribute("programme") Programme programme, ModelMap modelmap, @RequestParam("campus") String c, @RequestParam("university") String b,
								@RequestParam("faculty")String a, @RequestParam("deparment")String w,Deparment deparment,Faculty faculty, 
								Campus campus,@RequestParam("Otype")String qa,@RequestParam("Year")String wqa) {

		int q=Integer.parseInt(w);
			int o=Integer.parseInt(c);
			int z=Integer.parseInt(a);
			int l=Integer.parseInt(b);

			programme.setOtype(qa);
			programme.setIntervals(wqa);
		programme.setDeparmentid(q);
		deparment.setFaculty_id(z);
		faculty.setIcd(o);
		campus.setUniversityid(l);
		programmeservice.saveprogramme(programme);

		return "redirect:/viewprogramme";
	}
	
	@RequestMapping("/editprogramme")
	public String editprogramme(@RequestParam("id")int z, ModelMap modelmap)
	{
		Programme programme=programmeservice.getprogrammebyid(z);
		List<University> university=universityService.getalluniversity();
	List<Campus>campus=campusService.getallCampus();
	List<Faculty>faculty=facultyservice.getallFaculty();
	List<Deparment>deparment=deparmentService.getalldeparment();
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("faculty",faculty);
		modelmap.addAttribute("campus",campus);
		modelmap.addAttribute("university",university);
    	modelmap.addAttribute("deparment",deparment);
        modelmap.addAttribute("programme",programme);



		return "programme3";
	}

	@RequestMapping("/deleteprogramme")
  public String deleteProgramme(@RequestParam("id")int y)
  {
  	Programme programme=programmeservice.getprogrammebyid(y);
  	programmeservice.deleteprogramme(programme);


  	return "redirect:/viewprogramme";
  }
		
	
	
	
	@RequestMapping("/viewprogramme")
	public  String viewProgramme(ModelMap modelmap)
	{
		List<Programme>programme=programmeservice.getallprogramme();
		List<University> university=universityService.getalluniversity();
		List<Campus>campus=campusService.getallCampus();
		List<Faculty>faculty=facultyservice.getallFaculty();
		List<Deparment>deparment=deparmentService.getalldeparment();
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("faculty",faculty);
		modelmap.addAttribute("campus",campus);
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("deparment",deparment);
        modelmap.addAttribute("programme",programme);


		return "programme2";
	}
	
	
	@RequestMapping("/viewprogrammes")
	public  String viewProgramm(ModelMap modelmap)
	{
		List<Programme>programme=programmeservice.getallprogramme();
		List<University> university=universityService.getalluniversity();
		List<Campus>campus=campusService.getallCampus();
		List<Faculty>faculty=facultyservice.getallFaculty();
		List<Deparment>deparment=deparmentService.getalldeparment();
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("faculty",faculty);
		modelmap.addAttribute("campus",campus);
		modelmap.addAttribute("university",university);
		modelmap.addAttribute("deparment",deparment);
        modelmap.addAttribute("programme",programme);


		return "programme";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
