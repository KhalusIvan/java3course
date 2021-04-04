package Khalus.Hotel.repos;

import java.util.List;
import java.util.Optional;

import Khalus.Hotel.entity.Guide;
import Khalus.Hotel.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//extends JpaRepository<Person, Long>
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    @Query(value = "SELECT * FROM PERSON", nativeQuery = true)
    List<Person> findPersons();

    @Query(value = "SELECT * FROM PERSON c WHERE c.id=:id ", nativeQuery = true)
    Optional<Person> findMyPerson(Long id);

    @Query(value = "DELETE FROM PERSON c where c.id=:id", nativeQuery = true)
    void deletePerson(Long id);

}
