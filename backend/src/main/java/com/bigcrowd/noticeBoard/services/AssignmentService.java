package com.bigcrowd.noticeBoard.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.AssignmentInfoDTO;
import com.bigcrowd.noticeBoard.entities.Assignment;
import com.bigcrowd.noticeBoard.repositories.AssignmentRepository;
import com.bigcrowd.noticeBoard.services.exceptions.DatabaseException;

@Service
public class AssignmentService {

	@Autowired
	private AssignmentRepository assignmentRepository; 
	
	@Transactional(readOnly = true)
	public List<AssignmentInfoDTO> findAll() {
		
		List<Assignment> assig = assignmentRepository.findAll();
		return assig.stream().map(x -> new AssignmentInfoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public AssignmentInfoDTO save(AssignmentInfoDTO dto) {
		
		Assignment assignment = new Assignment();
		dtoToEntity(assignment, dto);
		
		assignment = assignmentRepository.saveAndFlush(assignment);
		
		return new AssignmentInfoDTO(assignment);
	}

	@Transactional
	public AssignmentInfoDTO updateAssignment(Long id, AssignmentInfoDTO dto) {
		
		Assignment assignment = assignmentRepository.getById(id);
		dtoToEntity(assignment, dto);
		
		assignment = assignmentRepository.saveAndFlush(assignment);
		return new AssignmentInfoDTO(assignment);
	}
	
	private void dtoToEntity(Assignment assignment, AssignmentInfoDTO dto) {
		assignment.setTask(dto.getTask());
		assignment.setField(dto.getField());
	}

	public void deleteAssignment(Long id) {	
		
		
		try {
			assignmentRepository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}
}
