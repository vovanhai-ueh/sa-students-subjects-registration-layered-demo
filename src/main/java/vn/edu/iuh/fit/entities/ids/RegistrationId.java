package vn.edu.iuh.fit.entities.ids;

import jakarta.persistence.Id;

import java.io.Serializable;

public class RegistrationId implements Serializable {
    @Id
    private long studentId;
    @Id
    private long subjectId;
}
