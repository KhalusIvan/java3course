package Khalus.Hotel.services;

import Khalus.Hotel.dto.GuideRequest;
import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.repos.GuideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GuideService {
    private final GuideRepository repo;

    public Guide getById(Long id) {
        System.out.println(id);
        return repo.findMyGuide(id).orElseThrow();
    }

    public List<Guide> getAll() {
        return repo.findGuides();
    }

    public Guide create(GuideRequest request) {
        var guide = Guide.builder()
                .id(new Random().nextLong())
                .first_name(request.getFirst_name())
                .second_name(request.getSecond_name())
                .phone_number(request.getPhone_number())
                .hotels(new HashSet<>()).build();
        return repo.save(guide);
    }

    public void deleteGuide(Long id) {
        System.out.println(id);
        repo.deleteGuide(id);
    }
}
