package com.bigcrowd.noticeBoard.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
		
	Person findByName(String name);
	
	@Query("SELECT obj FROM Person obj JOIN FETCH obj.supports WHERE obj.id = :id")
	Optional<Person> findSupportById(Long id);
	
	@Query("SELECT obj FROM Person obj JOIN FETCH obj.designations WHERE obj.id = :id")
	Optional<Person> findDesignationById(Long id);

}
