package tn.m104.rh.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

<<<<<<< HEAD

=======
//premiere modif
// deuxième modification
>>>>>>> 8262a75f8dc579ff8adc4307aa02583b9ab9f2ed
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer rollNumber;
    String name;
    String address;
    Double percentage;

}
