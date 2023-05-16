package com.jsp.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcrud.dto.Admin;
import com.jsp.springbootcrud.service.AdminService;

@RestController
public class AdminController {
@Autowired
AdminService service;
//save
@PostMapping("/admins")
public Admin saveAdmin(@RequestBody Admin admin)
{
	return service.saveAdminService(admin);
}
//getall
@GetMapping("/admins")
public List<Admin> getAllAdmin()
{
	return service.getAllAdminService();
			
}
//getbyid
@GetMapping("/admins/{id}")
public Admin GetAdminById(@PathVariable int id)
{
	return service.getAdminByIdServive(id);
}
//update
@PutMapping("/admins")
public Admin updateAdmin(@RequestBody Admin admin)
{
	return service.updateAdminService(admin);
}
//delete
@DeleteMapping("/admins/{id}")
public Admin deleteAdmin(@PathVariable int id)
{
	return service.deleteAdminService(id);
}
}
