package com.bigcrowd.noticeBoard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
