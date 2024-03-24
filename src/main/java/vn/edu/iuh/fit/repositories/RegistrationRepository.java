package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.entities.Registration;
import vn.edu.iuh.fit.entities.ids.RegistrationId;

public interface RegistrationRepository extends JpaRepository<Registration, RegistrationId> {
}