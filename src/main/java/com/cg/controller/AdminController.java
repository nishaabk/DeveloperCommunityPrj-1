package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Admin;
import com.cg.entity.Feed;
import com.cg.service.AdminService;
import com.cg.service.FeedService;




@RestController
public class AdminController {
  @Autowired
  private AdminService adminService;
 @Autowired
 private FeedService feedService;
  
  
  @PostMapping("/addAdmin")
  public String addAdmin(@RequestBody Admin admin) {
	  return adminService.addAdmin(admin);
  }  
  
	  @PutMapping("/updateAdminPassword/{id}/{password}")
	  public Admin updateAdminPassword(@PathVariable("id")int adminId,@PathVariable("password")String newpassword) {
		 return adminService.updateAdminPassword(adminId,newpassword); 
	  }
	  
	  @PutMapping("/updateAdminName/{id}/{firstName}")
	  public Admin updateAdminName(@PathVariable("id")int adminId,@PathVariable("firstName")String firstName) {
		 return adminService.updateAdminName(adminId,firstName); 
	  }
	  
       @DeleteMapping("/deleteAdmin/{id}")
       public List<Admin> deleteAdmin(@PathVariable("id")int adminId){
    	   return adminService.deleteAdmin(adminId);
       }
       
		/*
		 * @PostMapping("/addFeed") public String addFeed(@RequestBody Feed feed) {
		 * return adminService.addFeed(feed); }
		 */
       
}
