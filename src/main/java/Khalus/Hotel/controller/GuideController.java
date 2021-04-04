package Khalus.Hotel.controller;

import Khalus.Hotel.dto.GuideRequest;
import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.services.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/guide")
public class GuideController {
    private final GuideService service;

    @GetMapping()
    public List<Guide> getAll(@RequestParam(required = false, defaultValue = "10") Integer size,
                              @RequestParam(required = false, defaultValue = "1") Integer page
    ) {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Guide get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Guide create(@RequestBody GuideRequest guide) {
        return service.create(guide);
    }

    @PutMapping("/{id}")
    public Optional<Guide> update(@PathVariable Long id, @RequestBody GuideRequest guide) {return null;}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {service.deleteGuide(id);}
}
