package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Admin;
import com.cg.entity.Feed;
import com.cg.repository.AdminRepository;
import com.cg.repository.FeedRepository;


@Service
public class AdminService {
@Autowired
private AdminRepository adminRepository;
@Autowired
private FeedRepository feedRepository;

public String addAdmin(Admin admin) {
	adminRepository.saveAndFlush(admin);
	return "admin added successfully";
}
public Admin updateAdminPassword(int id,String password) {
	Admin admin=adminRepository.findById(id).get();
	admin.setAdminPassword(password);
	adminRepository.flush();
	return admin;
}
public Admin updateAdminName(int id,String adminFirstName) {
	Admin admin=adminRepository.findById(id).get();
	admin.setAdminPassword(adminFirstName);
	adminRepository.flush();
	return admin;
}
public List<Admin> deleteAdmin(int id){
	adminRepository.deleteById(id);
	return adminRepository.findAll();
}

/*
 * public String addFeed(Feed feed) { feedRepository.saveAndFlush(feed); return
 * "feed added sucessfully"; }
 */
public List<Feed> deleteFeed(int id){
	feedRepository.deleteById(id);
	return feedRepository.findAll();
}
}
