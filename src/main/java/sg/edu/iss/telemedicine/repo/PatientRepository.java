package sg.edu.iss.telemedicine.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.telemedicine.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, String> {

	//KAT IS TESTING (11/8/2021) - Display patient by patientId
	@Query("SELECT p FROM Patient p WHERE p.id LIKE :id")
	public Optional<Patient> findPatientByPatientId(@Param("id") String id);
}
