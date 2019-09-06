package com.qo.C;

import com.qo.m.Organization;
import com.qo.s.OrganizationService;
import org.apache.commons.lang3.*;

import org.apache.commons.lang3.math.NumberUtils;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/*import org.springframework.util.StringUtils;*/
import org.springframework.web.bind.annotation.*;
/*import org.apache.commons.lang3.StringUtils;*/
import com.qo.m.University;
import com.qo.respo.OrganizationRespo;
import com.qo.respo.UniversityRespo;
import com.qo.s.UniversityService;

import java.lang.Object;
import javax.persistence.GeneratedValue;
import java.util.List;
import java.lang.*;
import java.util.regex.Pattern;

@Controller
public class UniversityController {

	@Autowired
	OrganizationService organizationservice;
	
	@Autowired
	UniversityService universityservice;
 

   @RequestMapping("/")
	public String mad()
	{
	   
	   return"index";
	}
	
	
	 @RequestMapping("/university") public String indexuniversity() {
	 
	 
	
	return"redirect:/viewuniversity"; }
	

	@RequestMapping("adduniversity")
	public String adduniversity(ModelMap modelmap,Organization organizato,University university)
	{

		List<Organization> organization=organizationservice.getallOrganization();
		modelmap.addAttribute("organization",organization);




		return"universitya";
	}







	 @RequestMapping("/viewuniversity")
		public String viewdetails(ModelMap modelmap)
		{
		  List<Organization> organization=organizationservice.getallOrganization();	  
		  List<University> university =universityservice.getalluniversity();
		   modelmap.addAttribute("university",university);
	      modelmap.addAttribute("organization",organization);
		 
		  return"university2";
			
		}

	 @RequestMapping("/viewuniversitys")
		public String viewdetail(ModelMap modelmap)
		{
		  List<Organization> organization=organizationservice.getallOrganization();	  
		  List<University> university =universityservice.getalluniversity();
		   modelmap.addAttribute("university",university);
	      modelmap.addAttribute("organization",organization);
		 
		  return"university";
			
		}
              
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


	public boolean stringContainsNumber( String s )
	{
		return Pattern.compile( "[0-9]" ).matcher( s ).find();
	}





	@RequestMapping("/saveuniversity")
 public String saveuniversity(@ModelAttribute("university")University university, @RequestParam("organization")String c,ModelMap modelmap) {



		String oa=university.getUname();
		String z=university.getCampus();
		String q=university.getContacts();
		String m=university.getWebsite();
		String ar=university.getLocation();
		String wq=university.getNcampus();

       String zzz=String.valueOf(wq);

		boolean QW =stringContainsNumber(oa);
		boolean az=stringContainsNumber(z);
		boolean qe=stringContainsNumber(m);
		boolean ap=stringContainsNumber(ar);
		boolean zx=stringContainsNumber(zzz);

		if(QW) {
			String b = "Enter a valid input";
			modelmap.addAttribute("a", b);

			List<Organization> organization = organizationservice.getallOrganization();
			modelmap.addAttribute("organization", organization);

			return"universitya";
		}






       else if(az)
		{
			String b = "Enter a valid input";
			modelmap.addAttribute("b", b);

			List<Organization> organization = organizationservice.getallOrganization();
			modelmap.addAttribute("organization", organization);


			return"universitya";
		}
       else if(qe)
		{
			String b = "Enter a valid input ";
			modelmap.addAttribute("w", b);

			List<Organization> organization = organizationservice.getallOrganization();
			modelmap.addAttribute("organization", organization);

			return"universitya";


		}

       else if(ap)
		{
			String b = "Enter a valid name input";
			modelmap.addAttribute("c", b);

			List<Organization> organization = organizationservice.getallOrganization();
			modelmap.addAttribute("organization", organization);

			return"universitya";
		}
      else if(q.length()>14&&q.length()<14)
		{
			String b = "Enter a valid name input";
			modelmap.addAttribute("z", b);

			List<Organization> organization = organizationservice.getallOrganization();
			modelmap.addAttribute("organization", organization);

			return"universitya";


		}
       else if(!zx){

			String b = "Enter a valid name input";
			modelmap.addAttribute("zz", b);

			List<Organization> organization = organizationservice.getallOrganization();
			modelmap.addAttribute("organization", organization);

			return"universitya";

		}


		int a=Integer.parseInt(c);
		university.setOrganization_id(a);        
		universityservice.saveuniversity(university);
		
	return"redirect:/viewuniversity";
	}

	
	@RequestMapping("/edituniversity")
	public String edituniversity(@RequestParam("id")int b,ModelMap modelmap)
	{
   University university =universityservice.getalluniversitybyId(b);
    List<Organization> organization=organizationservice.getallOrganization();
    modelmap.addAttribute("organization",organization);
    modelmap.addAttribute("university",university);
		return"university4";
	}
	

	  @RequestMapping("/deleteuniversity")
	public String deleteuniversity(@RequestParam("id")int c,ModelMap modelmap)
	{
		University university=universityservice.getalluniversitybyId(c);
		universityservice.deleteuniversity(university);
		
		return"redirect:/viewuniversity";
	}
	
	
	
	
	
	
	
}
