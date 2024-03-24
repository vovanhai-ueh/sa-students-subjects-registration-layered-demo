package vn.edu.iuh.fit.services;

import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.entities.Subject;
import vn.edu.iuh.fit.repositories.SubjectRepository;
import vn.edu.iuh.fit.utils.StudentStatus;

import java.util.List;

@Service
public class SubjectsServices {

    private final SubjectRepository repository;

    public SubjectsServices(SubjectRepository repository) {
        this.repository = repository;
    }

    //INSERT & UPDATE
    public void save(Subject subject){
        repository.save(subject);
    }


    public Subject findSubjectById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Subject> findAll(){
        return repository.findAll();
    }
}
