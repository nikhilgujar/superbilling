package com.cjc.controller;

import java.util.List;

import org.hibernate.dialect.MySQL55Dialect;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.User;
import com.cjc.modelDTO.UserDto;
import com.cjc.service.ServiceImp;
@RestController
public class HomeController {

	@Autowired
	ServiceImp si;
	@RequestMapping("/getdata/{id}")
	public UserDto m1(@PathVariable int id)
	{
		User user=si.getdata(id);
		
		ModelMapper mapper= new ModelMapper();
		UserDto userdto = new UserDto();
		
		UserDto udt= mapper.map(user, UserDto.class);
		return udt;
	}

	@RequestMapping(value="/getall", method = RequestMethod.GET)
	public List<UserDto> m2()
	{
		List<User> u=(List<User>)si.getdatalist();
		
		ModelMapper mapper1 = new ModelMapper();
		
		List<UserDto> udt1= mapper1.map(u, new TypeToken<List<UserDto>>() {}.getType());
		return udt1;
	}
	
	
	

	
}
