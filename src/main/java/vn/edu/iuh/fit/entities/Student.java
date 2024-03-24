package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import vn.edu.iuh.fit.utils.StudentStatus;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long id;
    private String name;
    private String email;
    private StudentStatus status;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
        this.status = StudentStatus.ACTIVE;
    }
}
