package Khalus.Hotel.services;

import Khalus.Hotel.dto.HotelRequest;
import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.entity.Hotel;
import Khalus.Hotel.repos.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class HotelService {
    private final HotelRepository repo;

    public List<Hotel> getAll() {
        return repo.findHotels();
    }

    public Hotel getById(Long id) {
        return repo.findMyHotel(id).orElseThrow();
    }

    public Hotel create(HotelRequest request) {
        var hotel = Hotel.builder()
                .id(new Random().nextLong())
                .name(request.getName())
                .stars(request.getStars())
                .country(request.getCountry())
                .city(request.getCity())
                .guide(request.getGuide())
                .trips(new HashSet<>()).build();
        return repo.save(hotel);
    }
}
