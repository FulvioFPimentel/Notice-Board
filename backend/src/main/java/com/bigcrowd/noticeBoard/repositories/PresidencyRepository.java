package com.bigcrowd.noticeBoard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bigcrowd.noticeBoard.entities.Presidency;

public interface PresidencyRepository extends JpaRepository<Presidency, Long> {
	
	@Query("SELECT obj FROM Presidency obj WHERE obj.id = :id")
	List<Presidency> findPresidenciesByDesignation(Long id);

}
