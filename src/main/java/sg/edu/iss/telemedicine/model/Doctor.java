package sg.edu.iss.telemedicine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import sg.edu.iss.telemedicine.model.Appointment;

@Entity
public class Doctor 
{
	@Id
	private String doctorId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobile;
	private String email;
	@OneToMany(mappedBy="doctor")
	@JsonIgnore
	private List<Appointment> appointments;
	
	
	public Doctor(String doctorId, String firstName, String lastName, String gender, String mobile, String email,
			List<Appointment> appointments) {
		super();
		this.doctorId = doctorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.appointments = appointments;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", mobile=" + mobile + ", email=" + email + ", appointments=" + appointments + "]";
	}
	
	
}
