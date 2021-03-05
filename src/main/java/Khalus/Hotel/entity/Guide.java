package Khalus.Hotel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity(name = "guide")
public class Guide {
    @Id
    private int id;

    private String first_name;
    private String second_name;
    private String phone_number;
    @OneToMany(mappedBy="guide")
    private Set<Hotel> hotels;
}
