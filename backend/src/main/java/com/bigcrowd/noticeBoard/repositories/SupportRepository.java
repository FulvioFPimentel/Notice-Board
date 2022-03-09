package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Support;

@Repository
public interface SupportRepository extends JpaRepository<Support, Long>{

	@Query("SELECT obj FROM Support obj WHERE obj.meeting = :meeting")
	Support findSupportByMeeting(Meeting meeting);
	
}
