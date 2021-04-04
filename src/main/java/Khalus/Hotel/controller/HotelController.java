package Khalus.Hotel.controller;

import Khalus.Hotel.dto.HotelRequest;
import Khalus.Hotel.entity.Hotel;
import Khalus.Hotel.services.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel")
public class HotelController {
    private final HotelService service;

    @GetMapping()
    public List<Hotel> getAll(@RequestParam(required = false, defaultValue = "10") Integer size,
                               @RequestParam(required = false, defaultValue = "1") Integer page
    ) {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Hotel get(@PathVariable Long id) { return service.getById(id); }

    @PostMapping
    public Hotel create(@RequestBody HotelRequest hotel) {
        return service.create(hotel);
    }

    @PutMapping("/{id}")
    public Hotel update(@PathVariable Long id, @RequestBody Hotel hotel) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {}
}
