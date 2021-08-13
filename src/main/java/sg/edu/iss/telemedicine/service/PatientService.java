package sg.edu.iss.telemedicine.service;

import java.util.ArrayList;
import java.util.Optional;

import sg.edu.iss.telemedicine.model.Appointment;
import sg.edu.iss.telemedicine.model.MedicalCertificate;
import sg.edu.iss.telemedicine.model.Patient;
import sg.edu.iss.telemedicine.model.Prescription;

public interface PatientService {

	//kat
	public ArrayList<Appointment> findConsultationHistoryByPatientId(String id);

	//kat
	public Prescription findPrescriptionById(int prescriptionId);

	//kat
	public MedicalCertificate findMedicalCertificateById(String mcId);

	//KAT IS TESTING (11/8/2021) - Display patient by patientId
	public Optional<Patient> findPatientByPatientId(String patientId);
	
}
