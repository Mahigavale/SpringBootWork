package app.institute.Intutech.Entity;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="directors_of_class")
public class directors {
     
	@Id
	private int dir_id;
	private String dir_name;
	private String dir_mobile;
	
	@DateTimeFormat
	private LocalDate dir_tookover;
	
	@DateTimeFormat
	private LocalDate dir_resigned;
	
	public int getDir_id() {
		return dir_id;
	}
	public void setDir_id(int dir_id) {
		this.dir_id = dir_id;
	}
	public String getDir_name() {
		return dir_name;
	}
	public void setDir_name(String dir_name) {
		this.dir_name = dir_name;
	}
	public String getDir_mobile() {
		return dir_mobile;
	}
	public void setDir_mobile(String dir_mobile) {
		this.dir_mobile = dir_mobile;
	}
	public LocalDate getDir_tookover() {
		return dir_tookover;
	}
	public void setDir_tookover(LocalDate dir_tookover) {
		this.dir_tookover = dir_tookover;
	}
	public LocalDate getDir_resigned() {
		return dir_resigned;
	}
	public void setDir_resigned(LocalDate dir_resigned) {
		this.dir_resigned = dir_resigned;
	}
	
}
