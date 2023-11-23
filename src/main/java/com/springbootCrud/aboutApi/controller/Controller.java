package com.springbootCrud.aboutApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootCrud.aboutApi.model.Entities;
import com.springbootCrud.aboutApi.repo.empRepositoy;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
	empRepositoy emprepositoy;
	 
    @PostMapping("/entities")
    public String createNewEmployee(@RequestBody Entities entities) {
    	emprepositoy.save(entities);
    	return"Employee created in Database";
    }
	 
}
