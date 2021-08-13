package sg.edu.iss.telemedicine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import sg.edu.iss.telemedicine.model.Appointment;

@Entity
public class Prescription 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String medicine;
	
	private String remarks;
	
	@OneToOne(mappedBy="prescription")
	@JsonIgnore
	private Appointment appoint;
	
	
	public Prescription(int id, String medicine, String remarks, Appointment appoint) {
		super();
		this.id = id;
		this.medicine = medicine;
		this.remarks = remarks;
		this.appoint = appoint;
	}
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Appointment getAppoint() {
		return appoint;
	}
	public void setAppoint(Appointment appoint) {
		this.appoint = appoint;
	}
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", medicine=" + medicine + ", remarks=" + remarks + ", appoint=" + appoint
				+ "]";
	}
	
	
}