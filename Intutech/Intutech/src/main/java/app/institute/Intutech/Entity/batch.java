package app.institute.Intutech.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class batch {

	
	@Id
	private String batch_name;
	
	private int batch_strength;
	
	private String batch_coordinator;
	private LocalDate batch_start;
	private LocalDate batch_commencement;
	public String getBatch_name() {
		return batch_name;
	}
	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}
	public int getBatch_strength() {
		return batch_strength;
	}
	public void setBatch_strength(int batch_strength) {
		this.batch_strength = batch_strength;
	}
	public String getBatch_coordinator() {
		return batch_coordinator;
	}
	public void setBatch_coordinator(String batch_coordinator) {
		this.batch_coordinator = batch_coordinator;
	}
	public LocalDate getBatch_start() {
		return batch_start;
	}
	public void setBatch_start(LocalDate batch_start) {
		this.batch_start = batch_start;
	}
	public LocalDate getBatch_commencement() {
		return batch_commencement;
	}
	public void setBatch_commencement(LocalDate batch_commencement) {
		this.batch_commencement = batch_commencement;
	}
	
	
}
