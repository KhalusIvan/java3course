package Khalus.Hotel.repos;

import Khalus.Hotel.entity.Person;
import Khalus.Hotel.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    @Query(value = "SELECT * FROM TRIP", nativeQuery = true)
    List<Trip> findTrips();

    @Query(value = "SELECT * FROM TRIP as c WHERE c.id = :id ", nativeQuery = true)
    Optional<Trip> findMyTrip(Long id);
}
