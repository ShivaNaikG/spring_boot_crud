package com.jsp.springbootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcrud.dto.Admin;
import com.jsp.springbootcrud.repository.AdminRepository;
@Repository
public class AdminDao {
	@Autowired
	AdminRepository repository;
	//save
public  Admin saveAdmin(Admin admin)
{
return repository.save(admin);
}
//getbyall
public List<Admin> getAllAdmin()
{
	return repository.findAll();
}
//getbyid
public Admin getAdminById(int id)
{
	Optional<Admin> optional=repository.findById(id);
	return optional.get();
}
//update
public Admin updateAdmin(Admin admin)
{
	Optional<Admin>optional=repository.findById(admin.getId());
	if(optional != null)
	{
		return repository.save(admin);
	}
	return optional.get();
}
//delete
public Admin deleteAdmin(int id)
{
	Optional<Admin>optional=repository.findById(id);
	if(optional != null)
	{
		repository.delete(optional.get());
	}
	return optional.get();
}
}
