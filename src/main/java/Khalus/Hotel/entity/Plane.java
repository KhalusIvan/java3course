package Khalus.Hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "plane")
public class Plane {
    @Id
    private Long id;

    private String flight_number;
    private String depart_time;
    private String depart_place;
    private String arrive_time;
    private String arrive_place;
    @OneToMany(mappedBy="plane")
    private Set<Trip> trips;

}
