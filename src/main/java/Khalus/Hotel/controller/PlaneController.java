package Khalus.Hotel.controller;

import Khalus.Hotel.dto.PlaneRequest;
import Khalus.Hotel.dto.PlaneResponse;
import Khalus.Hotel.entity.Plane;
import Khalus.Hotel.services.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plane")
public class PlaneController {
    private final PlaneService service;

    @GetMapping()
    public List<Plane> getAll(@RequestParam(required = false, defaultValue = "10") Integer size,
                              @RequestParam(required = false, defaultValue = "1") Integer page
    ) {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Plane get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Plane create(@RequestBody PlaneRequest plane) {
        return service.create(plane);
    }

    @PutMapping("/{id}")
    public Plane update(@PathVariable Long id, @RequestBody Plane plane) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {}
}
