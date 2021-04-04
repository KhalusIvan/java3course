package Khalus.Hotel.dto;

import Khalus.Hotel.entity.Hotel;
import Khalus.Hotel.entity.Person;
import Khalus.Hotel.entity.Plane;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Data
public class TripRequest {
    private Hotel hotel;
    private Person person;
    private Plane plane;
}
