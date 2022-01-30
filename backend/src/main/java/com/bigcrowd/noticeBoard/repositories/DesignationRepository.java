package com.bigcrowd.noticeBoard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bigcrowd.noticeBoard.entities.Designation;
import com.bigcrowd.noticeBoard.entities.Person;

public interface DesignationRepository extends JpaRepository<Designation, Long> {

	@Query("SELECT obj FROM Designation obj WHERE obj.person = :person")
	List<Designation> findAllByPerson(Person person);
	
	

}
