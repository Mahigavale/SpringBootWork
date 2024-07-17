package app.institute.Intutech.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	@Id
	private int student_id;
	
	private String student_name;
	private String student_batch;
	private boolean fees_status;
	private String student_education;
	private String student_city;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_batch() {
		return student_batch;
	}
	public void setStudent_batch(String student_batch) {
		this.student_batch = student_batch;
	}
	public boolean isFees_status() {
		return fees_status;
	}
	public void setFees_status(boolean fees_status) {
		this.fees_status = fees_status;
	}
	public String getStudent_education() {
		return student_education;
	}
	public void setStudent_education(String student_education) {
		this.student_education = student_education;
	}
	public String getStudent_city() {
		return student_city;
	}
	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}
	
	
	
}
