package Khalus.Hotel.controller;

import Khalus.Hotel.dto.TripRequest;
import Khalus.Hotel.entity.Trip;
import Khalus.Hotel.services.TripService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/trip")
public class TripController {
    private final TripService service;

    @GetMapping()
    public List<Trip> getAll(@RequestParam(required = false, defaultValue = "10") Integer size,
                             @RequestParam(required = false, defaultValue = "1") Integer page
    ) {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Trip get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Trip create(@RequestBody TripRequest trip) {
        return service.create(trip);
    }

    @PutMapping("/{id}")
    public Trip update(@PathVariable Long id, @RequestBody Trip trip) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {}

}
