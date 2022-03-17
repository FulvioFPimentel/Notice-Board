package com.bigcrowd.noticeBoard.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bigcrowd.noticeBoard.dto.NewsDTO;
import com.bigcrowd.noticeBoard.services.NewsService;

@RestController
@RequestMapping(value = "/news")
public class NewsController {
	
	@Autowired
	public NewsService newsService;
	
	@GetMapping
	public ResponseEntity<Page<NewsDTO>> findAllNewsPaged(Pageable pageable) {
		Page<NewsDTO> news = newsService.findAllNews(pageable);
		return ResponseEntity.ok().body(news);
	}
	
	@PostMapping
	public ResponseEntity<NewsDTO> insert(@RequestBody NewsDTO dto){
		dto = newsService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

}
