package app.Repository;

import app.Model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "select count(*) as cont, c.city_name " +
            "from city c group by c.city_name order by cont desc limit 5", nativeQuery = true)
    List<String> getTopFive();

    @Query(value = "select count(*) as cont, city_name " +
            "from city c group by c.city_name order by cont asc limit 5",nativeQuery = true)
    List<String> getBottomFive();

}
