package vn.edu.iuh.fit.services.impl;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Registration;
import vn.edu.iuh.fit.repositories.RegistrationRepository;
import vn.edu.iuh.fit.services.StudentSubjectRegistration;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class StudentSubjectRegistrationImpl implements StudentSubjectRegistration {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final RegistrationRepository registrationRepository;

    public StudentSubjectRegistrationImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public boolean registre(long studentId, long subjectId) {
        try {
            Registration registration = new Registration(studentId, subjectId);
            registration.setNotes("registered");
            registration.setResult(0f);
            registrationRepository.save(registration);
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getCause() + "\n" + e.getMessage());
            return false;
        }
        return true;
    }
}
