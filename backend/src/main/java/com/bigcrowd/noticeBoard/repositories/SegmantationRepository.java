package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Segmentation;

@Repository
public interface SegmantationRepository extends JpaRepository<Segmentation, Long>{

}
