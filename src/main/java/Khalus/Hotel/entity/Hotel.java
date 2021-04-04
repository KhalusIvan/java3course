package Khalus.Hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "hotel")
public class Hotel {
    @Id
    private Long id;

    private String name;
    private int stars;
    private String country;
    private String city;
    @OneToMany(mappedBy="hotel")
    private Set<Trip> trips;
    @ManyToOne
    @JoinColumn(name="guide_id")
    private Guide guide;
}
