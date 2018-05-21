package com.javasampleapproach.restdata.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javasampleapproach.restdata.model.Person;

@RepositoryRestResource(collectionResourceRel = "person", path = "person")


public interface PersonRepository extends PagingAndSortingRepository <Person, Integer> {

	List<Person> findByName(@Param("name") String name);

}

