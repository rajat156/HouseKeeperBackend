package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Admin;
import com.example.Service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/saveAdmin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		return this.adminService.saveAdmin(admin);
	}
	
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin(){
		return this.adminService.getAllAdmin();
	}
}
