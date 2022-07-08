package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.entity.Feed;

public interface FeedRepository extends JpaRepository<Feed,Integer>{
	
}
