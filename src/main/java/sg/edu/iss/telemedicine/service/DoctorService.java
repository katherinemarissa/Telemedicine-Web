package sg.edu.iss.telemedicine.service;

import java.util.ArrayList;

import sg.edu.iss.telemedicine.model.Appointment;

public interface DoctorService {

	//kat
	public ArrayList<Appointment> findAllAppointmentsByDoctorId(String doctorid);
	
}
