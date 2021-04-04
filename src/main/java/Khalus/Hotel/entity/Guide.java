package Khalus.Hotel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "guide")
public class Guide {
    @Id
    private Long id;

    private String first_name;
    private String second_name;
    private String phone_number;
    @OneToMany(mappedBy="guide")
    private Set<Hotel> hotels;
}
