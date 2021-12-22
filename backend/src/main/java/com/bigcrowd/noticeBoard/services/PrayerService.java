package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.PrayerDTO;
import com.bigcrowd.noticeBoard.entities.Prayer;
import com.bigcrowd.noticeBoard.repositories.PrayerRepository;

@Service
public class PrayerService {
	
	@Autowired
	private PrayerRepository prayerRepository;
	
	@Transactional(readOnly = true)
	public List<PrayerDTO> findAll() {
		List<Prayer> prayers = prayerRepository.findAll();
		return prayers.stream().map(x -> new PrayerDTO(x, x.getPerson())).collect(Collectors.toList());
	}

}
