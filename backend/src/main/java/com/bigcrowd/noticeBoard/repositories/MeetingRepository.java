package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Meeting;

@Repository
public interface MeetingRepository extends JpaRepository<Meeting ,Long> {

	
}
