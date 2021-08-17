package sg.edu.iss.telemedicine.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.telemedicine.model.Appointment;
import sg.edu.iss.telemedicine.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorAppointmentController {
	
	@Autowired
	DoctorService dservice;
	
	@RequestMapping("/bookings/{doctorId}")
	public String findBookingsByDoctorId(@PathVariable("doctorId") String doctorId, Model model) {
		
	    ArrayList<Appointment> blist = dservice.findAllAppointmentsByDoctorId(doctorId);   
 
	    model.addAttribute("blist", blist);
		  
		return "doctor-check-scheduled-bookings";
	}

}
