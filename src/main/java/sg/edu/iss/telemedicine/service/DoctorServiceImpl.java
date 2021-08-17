package sg.edu.iss.telemedicine.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.telemedicine.model.Appointment;
import sg.edu.iss.telemedicine.repo.AppointmentRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	 @Autowired 
	 AppointmentRepository arepo; 
	 
	//kat
  	public ArrayList<Appointment> findAllAppointmentsByDoctorId(String doctorid) {
  		return arepo.findAllAppointmentsByDoctorId(doctorid); 
  	}

}
