package Khalus.Hotel.dto;

import lombok.Data;

import java.util.HashSet;

@Data
public class GuideRequest {
    private Long id;
    private String first_name;
    private String second_name;
    private String phone_number;
    private HashSet hotels;
}
