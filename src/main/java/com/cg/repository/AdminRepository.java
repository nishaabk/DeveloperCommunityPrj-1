package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

	/*
	 * @Query("delete from feed f where f.feedId= ?1") void
	 * deleteFeedByfeedId(String feed);
	 */
}
