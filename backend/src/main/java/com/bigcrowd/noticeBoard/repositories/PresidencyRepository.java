package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Presidency;

@Repository
public interface PresidencyRepository extends JpaRepository<Presidency, Long> {

}
