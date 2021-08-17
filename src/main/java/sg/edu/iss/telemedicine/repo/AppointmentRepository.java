package sg.edu.iss.telemedicine.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.telemedicine.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, String>
{
	
	//kat - select a particular prescription for a particular patient using prescription id
	@Query("SELECT a FROM Appointment a WHERE a.patient.patientId LIKE :id") 
	public ArrayList<Appointment> findConsultationHistoryByPatientId(@Param("id") String id);
	
	//kat - select all appointments for a particular doctor id
 	@Query("SELECT a FROM Appointment a WHERE a.doctor.doctorId LIKE :id")
 	public ArrayList<Appointment> findAllAppointmentsByDoctorId(@Param("id") String id);

	//gen - select all appointments by doctor id
	@Query("SELECT a FROM Appointment a INNER JOIN a.doctor d WHERE d.doctorId LIKE :doctorid GROUP BY a.patient")
	 public ArrayList<Appointment> findAppointmentsByDoctorID(@Param("doctorid") String doctorid);
	 
	//gen - select all appointments by patient id
	 @Query("SELECT a FROM Appointment a INNER JOIN a.patient p WHERE p.patientId LIKE :patientid")
	 public ArrayList<Appointment> findAppointmentsByPatientID(@Param("patientid") String patientid);
}
