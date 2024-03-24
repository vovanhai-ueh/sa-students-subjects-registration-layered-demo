package vn.edu.iuh.fit.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.entities.Registration;

@RestController
@RequestMapping("/api")
public class StudentSubjectRegistrationController {

    @PostMapping("/registre")
    public ResponseEntity<Registration>registre(@RequestParam long studentId,@RequestParam long subjId){
        //????????
        return null;
    }

}
