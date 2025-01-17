package com.ott.Cornflix.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ott.Cornflix.Entity.Login;
import com.ott.Cornflix.Repository.Login_Repo;

@Service
public class Login_Service {

	
	 @Autowired
	 private Login_Repo repo;
	  
	 
	 public void Adduser(Login login)
	 {
		 
		    repo.save(login);
	 }
	
	 public void Addusers(List<Login> login)
	 {
		repo.saveAll(login); 
	 }
	 
	 public Login Find_user_by_name(String name)
	 {
		   return(repo.findbyname(name)); 
	 }
	 
	 public Login findbyid(String id)
	 {
		 return(repo.findById(id).get() );
	 }
	 
	 public void deletebyid(String id)
	 {
		 repo.deleteById(id);
	 }
	 
	 public int updatepassword(String new_password, String old_password)
	 {
		
	    return	 (repo.changepassword(new_password, old_password));
	 }
	 
	 public void updatepassword2(Login login)
	 {
		 repo.save(login);
	 }
	 
	 public List<Login> getall1()
	 {
		 return repo.findAll();
	 }
	 
	 public Login getbypassword(String pw)
	 {
		 return repo.selectuserbypassword(pw);
	 }
	 
	 
	 public void addfeedback(String feedback)
	 {
		 
	 }
	 
}
