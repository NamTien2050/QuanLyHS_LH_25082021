package StudentAndClassroom.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
}
