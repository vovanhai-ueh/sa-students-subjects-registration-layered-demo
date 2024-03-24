package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.entities.Subject;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(name = "getAllRegisteredSubjects", value = "select r from Registration r where r.studentId = :id")
    List<Student>getAllRegisteredSubjects();
}