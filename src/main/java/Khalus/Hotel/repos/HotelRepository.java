package Khalus.Hotel.repos;

import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.entity.Hotel;
import Khalus.Hotel.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel, Long> {
    @Query(value = "SELECT * FROM HOTEL", nativeQuery = true)
    List<Hotel> findHotels();

    @Query(value = "SELECT * FROM HOTEL c WHERE c.id = :id ", nativeQuery = true)
    Optional<Hotel> findMyHotel(Long id);
}
