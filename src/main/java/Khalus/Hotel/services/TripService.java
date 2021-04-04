package Khalus.Hotel.services;

import Khalus.Hotel.dto.TripRequest;
import Khalus.Hotel.entity.Person;
import Khalus.Hotel.entity.Trip;
import Khalus.Hotel.repos.TripRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class TripService {
    private final TripRepository repo;

    public Trip getById(Long id) {
        return repo.findMyTrip(id).orElseThrow();

    }

    public List<Trip> getAll() {
        return repo.findTrips();
    }


    public Trip create(TripRequest request) {
        var trip = Trip.builder()
                .id(new Random().nextLong())
                .hotel(request.getHotel())
                .person(request.getPerson())
                .plane(request.getPlane()).build();
        return repo.save(trip);
    }
}
