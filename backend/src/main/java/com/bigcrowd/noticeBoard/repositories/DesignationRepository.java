package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bigcrowd.noticeBoard.entities.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Long> {

}
