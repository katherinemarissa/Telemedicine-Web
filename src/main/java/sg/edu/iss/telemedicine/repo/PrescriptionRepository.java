package sg.edu.iss.telemedicine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.telemedicine.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

	@Query("SELECT pre FROM Prescription pre JOIN pre.appoint apt JOIN apt.patient WHERE pre.id LIKE :id")
	public Prescription findPrescriptionById(@Param("id") int id);
	
}
