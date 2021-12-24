package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting ,Long> {

	@Query("SELECT obj FROM Meeting obj")
	Page<Meeting> findPaged(Pageable pageable);
	
}
