package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subjectt_id")
    private long id;
    @Column(name = "subjectt_name")
    private String name;

    public Subject(String name) {
        this.name = name;
    }
}
