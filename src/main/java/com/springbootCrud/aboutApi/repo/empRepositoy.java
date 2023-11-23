package com.springbootCrud.aboutApi.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootCrud.aboutApi.model.Entities;

public interface empRepositoy extends MongoRepository<Entities, String>{

}
