package com.qo.s;

import com.qo.m.Campus;
import com.qo.m.Organization;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Component
public interface OrganizationService {
     
	Organization saveorganization( Organization organization);
    List<Organization> getallOrganization();
}
