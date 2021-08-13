package sg.edu.iss.telemedicine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.iss.telemedicine.model.Appointment;
import sg.edu.iss.telemedicine.model.MedicalCertificate;
import sg.edu.iss.telemedicine.model.Patient;
import sg.edu.iss.telemedicine.model.Prescription;
import sg.edu.iss.telemedicine.repo.AppointmentRepository;
import sg.edu.iss.telemedicine.repo.MedicalCertificateRepository;
import sg.edu.iss.telemedicine.repo.PatientRepository;
import sg.edu.iss.telemedicine.repo.PrescriptionRepository;

@Service
public class PatientServiceImpl implements PatientService
{
	
	@Autowired
	PrescriptionRepository prerepo;
	
	@Autowired
	AppointmentRepository aptrepo;
	
	@Autowired
	MedicalCertificateRepository mcrepo;
	
	@Autowired
	PatientRepository patrepo;
	
	

	//kat
	@Transactional
	public ArrayList<Appointment> findConsultationHistoryByPatientId(String id) {
		
		return (ArrayList<Appointment>)aptrepo.findConsultationHistoryByPatientId(id);
	}

	//kat
	@Override
	public Prescription findPrescriptionById(int prescriptionId) {
		Prescription p = prerepo.findPrescriptionById(prescriptionId);
		return p;
	}

	//kat
	@Override
	public MedicalCertificate findMedicalCertificateById(String mcId) {
		MedicalCertificate mc = mcrepo.findMedicalCertificateById(mcId);
		return mc;
	}

	//KAT IS TESTING (11/8/2021) - Display patient by patientId
	@Override
	public Optional<Patient> findPatientByPatientId(String patientId) {
		Optional<Patient> patient = patrepo.findById(patientId);
		return patient;
	}
	

}