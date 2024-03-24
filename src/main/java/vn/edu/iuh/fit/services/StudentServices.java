package vn.edu.iuh.fit.services;

import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.repositories.StudentRepository;
import vn.edu.iuh.fit.utils.StudentStatus;

import java.util.List;

@Service
public class StudentServices {
    private final StudentRepository repository;


    public StudentServices(StudentRepository repository) {
        this.repository = repository;
    }

    //INSERT & UPDATE
    public void save(Student student){
        repository.save(student);
    }

    //DELETE
    public void setState(Student student, StudentStatus state){
        student.setStatus(state);
    }

    public Student findStudentById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Student>findAll(){
        return repository.findAll();
    }

    public List<Student>getAllRegisteredSubjects(){
        return repository.getAllRegisteredSubjects();
    }

}
