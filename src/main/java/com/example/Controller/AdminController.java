package com.example.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Admin;
import com.example.Service.AdminService;

@RestController
@CrossOrigin("*")
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
	
	
	@PostMapping("/checkAdminLogin")
	public ResponseEntity<Admin> checkAdmin(@RequestBody Admin admin){
		
	
		 Admin checkAdmin = this.adminService.checkAdmin(admin);
		
		if(checkAdmin!=null) {
			return ResponseEntity.of(Optional.of(checkAdmin));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@GetMapping("/getAdminById/{adminId}")
	public Admin getAdminById(@PathVariable("adminId") int id) {
		return this.adminService.getAdminById(id);
	}
}
