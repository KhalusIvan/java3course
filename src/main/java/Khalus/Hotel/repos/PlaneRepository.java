package Khalus.Hotel.repos;

import Khalus.Hotel.dto.PlaneResponse;
import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.entity.Person;
import Khalus.Hotel.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaneRepository  extends JpaRepository<Plane, Long> {
    @Query(value = "SELECT * FROM PLANE", nativeQuery = true)
    List<Plane> findPlanes();

    @Query(value = "SELECT * FROM PLANE c WHERE c.id = :id ", nativeQuery = true)
    Optional<Plane> findMyPlane(Long id);

}
