package com.qo.s;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qo.m.Organization;
import com.qo.respo.OrganizationRespo;
@Component
public class Organizationimpl implements OrganizationService {

	
	@Autowired
	private OrganizationRespo organizationRespo;
	@Override
	public Organization saveorganization(Organization organization) {
		// TODO Auto-generated method stub
		return organizationRespo.save(organization);
	}

	@Override
	public List<Organization> getallOrganization() {
		// TODO Auto-generated method stub
		return organizationRespo.findAll();
	}

}
