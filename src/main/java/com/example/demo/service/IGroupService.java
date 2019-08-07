package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Group;
import com.example.demo.vo.GroupUserVo;


public interface IGroupService {

	@RequestMapping(value = "/api/group//{id}",method = RequestMethod.GET)
	Group findGroupById(@PathVariable("id") String id);
	
	@RequestMapping(value = "/api/group/add",method = RequestMethod.POST)
	Group addGroup(@RequestBody Group group);
	
	@RequestMapping(value = "/api/group/update",method = RequestMethod.POST)
	Group updateGroup(@RequestBody Group group);
	
	@RequestMapping(value = "/api/group/delete/{id}",method = RequestMethod.GET)
	void deleteGroup(@PathVariable(value = "id") String name);
	
	@RequestMapping(value = "/api/group/",method = RequestMethod.GET)
	List<Group> findAllGroup();
	
	@RequestMapping(value = "/api/group//find/{id}",method = RequestMethod.GET)
	GroupUserVo findGroupUsersByGid(@PathVariable(value = "id") String name);
}
