package Khalus.Hotel.services;

import Khalus.Hotel.dto.PersonRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.entity.Person;
import Khalus.Hotel.repos.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repo;

    public Person getById(Long id) {
        System.out.println(id + " !!!!!!!!!!!!!");
        return repo.findMyPerson(id).orElseThrow();
    }

    public List<Person> getAll() {
        return repo.findPersons();
    }

    public void deletePerson(Long id) {
        repo.deletePerson(id);}

    public Person create(PersonRequest request) {
        var person = Person.builder()
                .id(new Random().nextLong())
                .passport_number(request.getPassport_number())
                .first_name(request.getFirst_name())
                .second_name(request.getSecond_name())
                .data_of_birth(request.getData_of_birth())
                .address(request.getAddress())
                .trips(new HashSet<>()).build();
        return repo.save(person);
    }
}
