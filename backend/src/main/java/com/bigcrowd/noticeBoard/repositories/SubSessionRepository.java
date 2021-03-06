package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.SubSession;

@Repository
public interface SubSessionRepository extends JpaRepository<SubSession, Long> {


}
