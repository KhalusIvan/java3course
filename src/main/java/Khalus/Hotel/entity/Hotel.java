package Khalus.Hotel.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "hotel")
public class Hotel {
    @Id
    private int id;

    private String name;
    private int stars;
    private String country;
    private String city;
    private String excursion;
    @OneToMany(mappedBy="hotel")
    private Set<Trip> trips;
    @ManyToOne
    @JoinColumn(name="guide_id")
    private Guide guide;
}
