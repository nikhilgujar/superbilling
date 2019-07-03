package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Repository.HomeRepository;
import com.cjc.model.User;
@Service
public class ServiceImp {
	@Autowired 
	HomeRepository hr;
	
	public User getdata(int id)
	{
		
		User u= hr.findById(id).get();
		
		return u;
	}
	
	public List<User> getdatalist()
	{
		
		List<User>l=(List<User>)hr.findAll();
		
		return l;
	}

}
