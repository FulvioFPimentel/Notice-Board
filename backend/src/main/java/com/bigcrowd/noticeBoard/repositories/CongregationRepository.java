package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Congregation;

@Repository
public interface CongregationRepository extends JpaRepository<Congregation, Long>{

}
