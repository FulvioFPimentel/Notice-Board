package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigcrowd.noticeBoard.dto.AssignmentInfoDTO;
import com.bigcrowd.noticeBoard.entities.Assignment;
import com.bigcrowd.noticeBoard.repositories.AssignmentRepository;

@Service
public class AssignmentService {

	@Autowired
	private AssignmentRepository assignmentRepository; 
	
	public List<AssignmentInfoDTO> findAll() {
		
		List<Assignment> assig = assignmentRepository.findAll();
		return assig.stream().map(x -> new AssignmentInfoDTO(x)).collect(Collectors.toList());
	}
	
	public AssignmentInfoDTO save(AssignmentInfoDTO dto) {
		
		Assignment assignment = new Assignment();
		
		assignment.setTask(dto.getTask());
		assignment.setField(dto.getField());
		
		assignment = assignmentRepository.saveAndFlush(assignment);
		
		return new AssignmentInfoDTO(assignment);
	}
}
