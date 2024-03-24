package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.entities.Student;
import vn.edu.iuh.fit.entities.Subject;
import vn.edu.iuh.fit.services.StudentServices;
import vn.edu.iuh.fit.services.SubjectsServices;

@SpringBootApplication
public class SaStudentsSubjectsRegistrationLayeredDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SaStudentsSubjectsRegistrationLayeredDemoApplication.class, args);
    }

    @Autowired
    private StudentServices studentServices;
    @Autowired
    private SubjectsServices services;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            Student s = new Student("student " + i, "email" + i + "@gmail.com");
            studentServices.save(s);
        }
        services.save(new Subject("OOP"));
        services.save(new Subject("Algorithm"));
        services.save(new Subject("Political"));
        services.save(new Subject("Physical"));
        services.save(new Subject("Database"));
    }
}
