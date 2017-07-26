package com.controller;

import java.io.IOException;
import java.util.List;

import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.common.util.BloomFilter;
import org.elasticsearch.common.xcontent.ToXContent.Params;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.Actor;
import com.repository.ActorRepository;

@RestController
public class MainController {

	@Autowired
	private ActorRepository actorRepository;
	
	@RequestMapping(value="/getAll", method=RequestMethod.GET)
	List<Actor> actor(){
		return (List<Actor>) actorRepository.findAll();
		
	}
	@RequestMapping(value="/search/{searchString}", method=RequestMethod.GET)
	List<Actor> searchActor(@PathVariable("searchString") String searchString){
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.
				  .build();
		return (List<Actor>) actorRepository.search();
		
	}

}
