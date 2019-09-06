package com.qo.s;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qo.m.*;
import com.qo.respo.*;
 
@Service
public class Userserviceimple implements UserService {

@Autowired	
private UserRespo userrespo;	
	


	@Override
	public Users saveuser(Users user) {
		// TODO Auto-generated method stub
		return userrespo.save(user);
	}

	@Override
	public Users updateuser(Users user) {
		// TODO Auto-generated method stub
		return userrespo.save(user);
	}

	@Override
	public void deleteuser(Users user) {
		// TODO Auto-generated method stub
            userrespo.delete(user);
	}

	@Override
	public Users getbyid(int id) {
		return userrespo.getOne(id);
	}


	@Override
	public List<Users> getallusers() {
		// TODO Auto-generated method stub
		return userrespo.findAll();
	}
	
	
	public UserRespo getUserrespo() {
		return userrespo;
	}
    
	public void setUserrespo(UserRespo userrespo) {
		this.userrespo = userrespo;
	}

}
