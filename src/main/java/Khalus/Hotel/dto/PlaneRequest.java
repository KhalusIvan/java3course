package Khalus.Hotel.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class PlaneRequest {
    private String flight_number;
    private String depart_time;
    private String depart_place;
    private String arrive_time;
    private String arrive_place;
}
