package com.bigcrowd.noticeBoard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Meeting;
import com.bigcrowd.noticeBoard.entities.Segmentation;
import com.bigcrowd.noticeBoard.entities.SegmentationPK;
import com.bigcrowd.noticeBoard.entities.Session;
import com.bigcrowd.noticeBoard.entities.SubSession;

@Repository
public interface SegmantationRepository extends JpaRepository<Segmentation, SegmentationPK>{
	
	@Query("DELETE FROM Segmentation obj WHERE "
			+ "(obj.id.meeting = :meetingId) AND"
			+ "(obj.id.session = :sessionId) AND"
			+ "(obj.id.subsession = :subsessionId)")
	Segmentation deleteSegmentationById(Long meetingId, Long sessionId, Long subsessionId);
	
	@Query("SELECT obj FROM Segmentation obj WHERE obj.id.meeting = :meetingId")
	List<Segmentation> findByMeeting(Meeting meetingId);
	
	@Query("SELECT obj FROM Segmentation obj WHERE obj.id.session = :sessionId")
	List<Segmentation> findBySession(Session sessionId);
	
	@Query("SELECT obj FROM Segmentation obj WHERE obj.id.subsession = :subsessionId")
	Segmentation findBySubSession(SubSession subsessionId);

}
