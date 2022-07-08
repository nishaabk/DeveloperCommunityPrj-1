package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Feed;
import com.cg.repository.FeedRepository;

@Service
public class FeedService {
	@Autowired
	private FeedRepository feedRepository;
	
	public String addFeed(Feed feed) {
		feedRepository.save(feed);
		return "feed added sucessfully";
	}
}
