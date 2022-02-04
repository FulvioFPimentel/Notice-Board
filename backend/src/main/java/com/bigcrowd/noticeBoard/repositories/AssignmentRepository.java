package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{

}
