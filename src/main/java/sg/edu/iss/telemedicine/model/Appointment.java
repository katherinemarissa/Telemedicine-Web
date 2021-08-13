package sg.edu.iss.telemedicine.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

import sg.edu.iss.telemedicine.model.Doctor;
import sg.edu.iss.telemedicine.model.MedicalCertificate;
import sg.edu.iss.telemedicine.model.Patient;
import sg.edu.iss.telemedicine.model.Prescription;

@Entity
public class Appointment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@DateTimeFormat (pattern="dd-MM-yyyy")
	private Date appointmentDate;	
	
	@DateTimeFormat(pattern ="HH:mm")
	private Date appointmentTime;
	
	@ManyToOne
	private Doctor doctor;
	
	@ManyToOne
	private Patient patient;
	
	@OneToOne//(mappedBy="appoint")
	private Prescription prescription;

	@OneToOne//(mappedBy="appointMC")
	private MedicalCertificate mc;
	
	
	
	
	
	public Appointment() {
		super();
	}





	public Appointment(Date appointmentDate,Date appointmentTime) {
		super();
		this.appointmentDate = appointmentDate;
		this.appointmentTime=appointmentTime;
	}





	public Appointment(int id, Date appointmentDate,Date appointmentTime) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.appointmentTime=appointmentTime;
	}





	public Appointment(int id, Date appointmentDate,Date appointmentTime, Doctor doctor, Patient patient, Prescription prescription,
			MedicalCertificate mc) {
		super();
		this.id = id;
		this.appointmentDate = appointmentDate;
		this.doctor = doctor;
		this.patient = patient;
		this.prescription = prescription;
		this.mc = mc;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public Date getAppointmentDate() {
		return appointmentDate;
	}





	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}





	public Doctor getDoctor() {
		return doctor;
	}





	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}





	public Patient getPatient() {
		return patient;
	}





	public void setPatient(Patient patient) {
		this.patient = patient;
	}





	public Prescription getPrescription() {
		return prescription;
	}





	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}





	public MedicalCertificate getMc() {
		return mc;
	}





	public void setMc(MedicalCertificate mc) {
		this.mc = mc;
	}





	public Date getAppointmentTime() {
		return appointmentTime;
	}





	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	 
	
}