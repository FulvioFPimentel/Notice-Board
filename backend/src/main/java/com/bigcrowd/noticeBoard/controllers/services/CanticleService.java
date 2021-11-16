package com.bigcrowd.noticeBoard.controllers.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.CanticleDTO;
import com.bigcrowd.noticeBoard.entities.Canticle;
import com.bigcrowd.noticeBoard.repositories.CanticleRepository;

@Service
public class CanticleService {
	
	@Autowired
	private CanticleRepository canticleRepository;
	
	@Transactional(readOnly = true)
	public List<CanticleDTO> findAll(){
		List<Canticle> canticles = canticleRepository.findAll();
		return canticles.stream().map(x -> new CanticleDTO(x)).collect(Collectors.toList());
	}

}
