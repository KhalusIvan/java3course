package Khalus.Hotel.dto;

import lombok.Data;

@Data
public class PersonRequest {
    private String passport_number;
    private String first_name;
    private String second_name;
    private String data_of_birth;
    private String address;
}
