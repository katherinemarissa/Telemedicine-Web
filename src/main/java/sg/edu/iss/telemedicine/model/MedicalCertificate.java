package sg.edu.iss.telemedicine.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class MedicalCertificate 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private LocalDate dateTo;
	
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private LocalDate dateFrom;
	
	private int duration;
	
	@OneToOne(mappedBy="mc")
	@JsonIgnore
	private Appointment appointMC;
	
	
	public MedicalCertificate(String id, LocalDate dateTo, LocalDate dateFrom, int duration, Appointment appointMC) {
		super();
		this.id = id;
		this.dateTo = dateTo;
		this.dateFrom = dateFrom;
		this.duration = duration;
		this.appointMC = appointMC;
	}


	public MedicalCertificate() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public LocalDate getDateTo() {
		return dateTo;
	}


	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}


	public LocalDate getDateFrom() {
		return dateFrom;
	}


	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public Appointment getAppointMC() {
		return appointMC;
	}


	public void setAppointMC(Appointment appointMC) {
		this.appointMC = appointMC;
	}


	@Override
	public String toString() {
		return "MedicalCertificate [id=" + id + ", dateTo=" + dateTo + ", dateFrom=" + dateFrom + ", duration="
				+ duration + "]"; // ", appointMC=" + appointMC + "]";
	}
	
	
}