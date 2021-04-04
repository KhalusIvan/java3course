package Khalus.Hotel.controller;

import Khalus.Hotel.dto.PersonRequest;
import Khalus.Hotel.entity.Person;
import Khalus.Hotel.services.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PersonService service;

        @GetMapping()
    public List<Person> getAll(@RequestParam(required = false, defaultValue = "10") Integer size,
                               @RequestParam(required = false, defaultValue = "1") Integer page
    ) {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Person get(@PathVariable Long id) { return service.getById(id); }

    @PostMapping
    public Person create(@RequestBody PersonRequest person) {
        System.out.println(333);return service.create(person); }

    @PutMapping("/{id}")
    public Person update(@PathVariable Long id, @RequestBody Person person) {
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(Long id) {
        System.out.println(3);service.deletePerson(id); return "Yes";}
}
