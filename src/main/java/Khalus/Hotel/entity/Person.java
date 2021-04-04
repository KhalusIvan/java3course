package Khalus.Hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "person")
public class Person {
    @Id
    private Long id;

    private String passport_number;
    private String first_name;
    private String second_name;
    private String data_of_birth;
    private String address;
    @OneToMany(mappedBy="person")
    private Set<Trip> trips;

}
