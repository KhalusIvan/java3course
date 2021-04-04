package Khalus.Hotel.services;

import Khalus.Hotel.dto.PlaneRequest;
import Khalus.Hotel.dto.PlaneResponse;
import Khalus.Hotel.entity.Person;
import Khalus.Hotel.entity.Plane;
import Khalus.Hotel.repos.PlaneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class PlaneService {
    private final PlaneRepository repo;

    public Plane getById(Long id) {
        return repo.findMyPlane(id).orElseThrow();
    }

    public List<Plane> getAll() {
        return repo.findPlanes();
    }


    public Plane create(PlaneRequest request) {
        var plane = Plane.builder()
                .id(new Random().nextLong())
                .flight_number(request.getFlight_number())
                .depart_time(request.getDepart_time())
                .depart_place(request.getDepart_place())
                .arrive_time(request.getArrive_time())
                .arrive_place(request.getArrive_place())
                .trips(new HashSet<>()).build();
        return repo.save(plane);
    }
}
