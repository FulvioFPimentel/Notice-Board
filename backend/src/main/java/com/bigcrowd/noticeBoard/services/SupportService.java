package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.SupportDTO;
import com.bigcrowd.noticeBoard.entities.Support;
import com.bigcrowd.noticeBoard.repositories.SupportRepository;

@Service
public class SupportService {
	
	@Autowired
	private SupportRepository supportRepository;
	
	@Transactional(readOnly = true)
	public List<SupportDTO> findAll(){
		List<Support> supports = supportRepository.findAll();
		return supports.stream().map(x -> new SupportDTO(x, x.getPersons())).collect(Collectors.toList());
	}

}
