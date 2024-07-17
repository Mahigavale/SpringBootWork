package com.School.SunriseSchool.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.School.SunriseSchool.Entity.Student;
import com.School.SunriseSchool.Entity.Teacher;
import com.School.SunriseSchool.Repository.TeacherRepo;

@RestController
public class TeacherController {
   
	@Autowired
	TeacherRepo repo2;
	
	@PostMapping("/add-teacher")
	public String addteacher(@RequestBody Teacher teacher)
	{
		repo2.save(teacher);
		return "the teahcer with the id"+teacher.getTeacher_id()+"is added sucessfully..!";
	}
	
	@PutMapping("/update-teacher-name")
	public String updateteachername(@RequestParam("newname") String newname, @RequestParam("oldname") String oldname)
	{
		repo2.updateteachername(oldname, newname);
		return "teachre's name changed from"+oldname+"to new name"+newname;
	}
	
	@PutMapping("update-teacher-contact")
	public String updateteachercontact(@RequestParam("newcon")String newcon,@RequestParam("oldcon") String oldcon)
	{
		repo2.updateteachercontact(newcon, oldcon);
		
		return "the teacher with the contact"+oldcon+"changed to the new contact"+newcon;
	}
	@DeleteMapping("/delete-teacher/{id}")
	public String delete(@PathVariable("id") int id)
	{
		repo2.deleteById(id);
		return "the teacher with the id"+id+"is deleted sucessfully..!";
	}
	
	@GetMapping("/get-all-teachers")
	public Set<Teacher> getallteachers()
	{
		return (Set<Teacher>) repo2.findAll();
	}
}
