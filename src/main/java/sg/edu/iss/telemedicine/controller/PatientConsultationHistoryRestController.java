package sg.edu.iss.telemedicine.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.iss.telemedicine.model.Appointment;
import sg.edu.iss.telemedicine.model.MedicalCertificate;
import sg.edu.iss.telemedicine.model.Patient;
import sg.edu.iss.telemedicine.model.Prescription;
import sg.edu.iss.telemedicine.service.PatientService;

@CrossOrigin
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class PatientConsultationHistoryRestController {

	@Autowired
	PatientService pservice;
	
		//Display consultation history by patientId
		@RequestMapping("/list/{patientId}")
		public ResponseEntity<List<Appointment>> findConsultationHistoryByPatientId(@PathVariable("patientId") String patientId)
		{
			ArrayList<Appointment> alist = pservice.findConsultationHistoryByPatientId(patientId);
			return new ResponseEntity<List<Appointment>>(alist, HttpStatus.OK);
		}
		
		//Display selected prescription
		@RequestMapping("/prescription/{prescriptionId}")
		public ResponseEntity<Prescription> findPrescriptionById(@PathVariable("prescriptionId") int prescriptionId)
		{
			Prescription prescription = pservice.findPrescriptionById(prescriptionId);
			return new ResponseEntity<Prescription>(prescription, HttpStatus.OK);
		}
		
		//Display selected MC
//		@RequestMapping("/mc/{mcId}")
//		public ResponseEntity<MedicalCertificate> findMCById(@PathVariable("mcId") String mcId)
//		{
//			
//			MedicalCertificate mc = pservice.findMedicalCertificateById(mcId);
//			return new ResponseEntity<MedicalCertificate>(mc, HttpStatus.OK);
//		}
		
		//KAT IS TESTING (11/8/2021) - Display patient by patientId
		@RequestMapping("/patient/{patientId}")
		public ResponseEntity<Optional<Patient>> findPatientByPatientId(@PathVariable("patientId") String patientId)
		{
			Optional<Patient> patient = pservice.findPatientByPatientId(patientId);
			return new ResponseEntity<Optional<Patient>>(patient, HttpStatus.OK);
		}
}
