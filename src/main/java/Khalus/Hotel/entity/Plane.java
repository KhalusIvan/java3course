package Khalus.Hotel.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.Set;

@Data
@Entity(name = "plane")
public class Plane {
    @Id
    private int id;

    private String flight_number;
    private Date depart_time;
    private String depart_place;
    private Date arrive_time;
    private String arrive_place;
    @OneToMany(mappedBy="plane")
    private Set<Trip> trips;

}
