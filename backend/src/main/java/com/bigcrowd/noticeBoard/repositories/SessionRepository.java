package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{
	
	
}
