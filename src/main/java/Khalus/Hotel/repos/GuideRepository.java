package Khalus.Hotel.repos;

import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.entity.Hotel;
import Khalus.Hotel.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository

public interface GuideRepository extends JpaRepository<Guide, Long> {

    @Query(value = "SELECT * FROM GUIDE", nativeQuery = true)
    List<Guide> findGuides();

    @Query(value = "SELECT * FROM GUIDE c WHERE c.id = :id ", nativeQuery = true)
    Optional<Guide> findMyGuide( @Param("id")Long id);

   // @Query(value = "UPDATE Guide SET first_name = c.first_name, second_name = c.second_name, " +
   //         "phone_number = c.phone_number, hotels = c.hotels" +
   //         " as c where c.id = :id ", nativeQuery = true)
    //Optional<Guide> upd(Guide guide);

    @Query(value = "DELETE FROM Guide as c where c.id = :id ", nativeQuery = true)
    Optional<Guide> deleteGuide(Long id);

}
