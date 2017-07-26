package com.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;

import com.dao.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer>, ElasticsearchRepository<Actor, Integer> {

	
}
