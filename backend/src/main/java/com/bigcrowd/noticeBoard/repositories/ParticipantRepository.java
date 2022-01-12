package com.bigcrowd.noticeBoard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bigcrowd.noticeBoard.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long>{

	@Query("SELECT obj FROM Participant obj WHERE obj.id = :id")
	List<Participant> findPartidipantsByDesignation(Long id);
}
