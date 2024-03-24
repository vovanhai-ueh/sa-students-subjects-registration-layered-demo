package vn.edu.iuh.fit.services;

import org.springframework.stereotype.Service;

@Service
public interface StudentSubjectRegistration {
    boolean registre(long studentId, long subjectId);
}
