package com.bigcrowd.noticeBoard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bigcrowd.noticeBoard.dto.NewsDTO;
import com.bigcrowd.noticeBoard.entities.News;
import com.bigcrowd.noticeBoard.repositories.NewsRepository;

@Service
public class NewsService {
	
	@Autowired
	public NewsRepository newsRepository;
	
	@Transactional(readOnly = true)
	public Page<NewsDTO> findAllNews(Pageable pageable) {
		Page<News> news = newsRepository.findAll(pageable);
		return news.map(x -> new NewsDTO(x));
	}
	
	public NewsDTO insert(NewsDTO dto) {
		
		News news = new News();
		
		news.setDate(dto.getDate());
		news.setTitle(dto.getTitle());
		news.setNews(dto.getNews());
		
		news = newsRepository.saveAndFlush(news);
		
		return new NewsDTO(news);
	}
}
