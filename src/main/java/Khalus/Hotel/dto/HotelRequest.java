package Khalus.Hotel.dto;

import Khalus.Hotel.entity.Guide;
import lombok.Data;

@Data
public class HotelRequest {
    private String name;
    private int stars;
    private String country;
    private String city;
    private Guide guide;
}
