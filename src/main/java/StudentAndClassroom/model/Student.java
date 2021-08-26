package StudentAndClassroom.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    private Date dateOfBirth;
    private String address;
    @Column(nullable = false)
    private String phoneNumber;
//    @Pattern(regexp = "^[a-zA-z0-9]{3,}@gmail\\.[a-z]{3}$")
    private String email;

    @ManyToMany
    @JoinTable(
            name = "student classroom",
            joinColumns = @JoinColumn(name = "student id"),
            inverseJoinColumns = @JoinColumn(name = "classroom id"))
    List<ClassRoom> list;
//
//    @Override
//    public boolean supports(Classs<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        Student student = (Student) target;
//
//    }
}
