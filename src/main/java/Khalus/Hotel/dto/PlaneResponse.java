package Khalus.Hotel.dto;

import lombok.Data;

import java.sql.Date;
import java.util.HashSet;

@Data
public class PlaneResponse {
    private String flight_number;
    private String depart_time;
    private String depart_place;
    private String arrive_time;
    private String arrive_place;
    private HashSet trips;
}
