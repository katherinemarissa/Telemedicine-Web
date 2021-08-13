package sg.edu.iss.telemedicine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.telemedicine.model.MedicalCertificate;

public interface MedicalCertificateRepository extends JpaRepository<MedicalCertificate, String> {

	@Query("SELECT mc FROM MedicalCertificate mc JOIN mc.appointMC apt JOIN apt.patient pa JOIN apt.doctor d WHERE mc.id LIKE :id")
	public MedicalCertificate findMedicalCertificateById(@Param("id") String id);

}
