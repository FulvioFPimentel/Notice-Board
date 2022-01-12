package com.bigcrowd.noticeBoard.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bigcrowd.noticeBoard.entities.Prayer;

@Repository
public interface PrayerRepository extends JpaRepository<Prayer, Long>{
	
	@Query("SELECT obj FROM Prayer obj WHERE obj.id = :id")
	List<Prayer> findPrayersByDesignation(Long id);

}
