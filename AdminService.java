package com.jsp.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootcrud.dao.AdminDao;
import com.jsp.springbootcrud.dto.Admin;

@Service
public class AdminService {
@Autowired
AdminDao dao;
//save
public Admin saveAdminService(Admin admin)
{
	return dao.saveAdmin(admin);
}
//getbyall
public List<Admin> getAllAdminService()
{
	return dao.getAllAdmin();
}
//getbyid
public Admin getAdminByIdServive(int id)
{
	return dao.getAdminById(id);
}
//update
public Admin updateAdminService(Admin admin)
{
	return dao.updateAdmin(admin);
}
//delete
public Admin deleteAdminService(int id)
{
	return dao.deleteAdmin(id);
}
}
