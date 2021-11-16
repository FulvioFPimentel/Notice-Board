package com.bigcrowd.noticeBoard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Canticle;

@Repository
public interface CanticleRepository extends JpaRepository<Canticle, Long> {

}
