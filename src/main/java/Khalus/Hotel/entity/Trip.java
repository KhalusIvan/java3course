package Khalus.Hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "trip")
public class Trip {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="hotel_id")
    private Hotel hotel;
    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;
    @ManyToOne
    @JoinColumn(name="plane_id")
    private Plane plane;

}
