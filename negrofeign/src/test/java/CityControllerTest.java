import app.Controller.CityController;
import app.Repository.CityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;
import java.util.List;
import java.util.Arrays;

public class CityControllerTest {

    @InjectMocks
    CityController cityController;

    @Mock
    CityRepository cityRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void getTopFiveTest(){
        String city1 = "6,London";
        String city2 = "4,Santiago";
        String city3 = "3,Buenos Aires";
        String city4 = "3,Madrid";
        String city5 = "3,Tokyo";
        List<String> cities =  Arrays.asList(city1,city2,city3,city4,city5);
        when(cityRepository.getTopFive()).thenReturn(cities);
        List<String> citiesResult = cityController.getTopFive();


        assertArrayEquals(citiesResult.toArray(),cities.toArray());

    }

    @Test
    void getBottomFiveTest(){
        String city1 = "1,San Antonio";
        String city2 = "1,Sidney";
        String city3 = "2,Rome";
        String city4 = "2,Washington";
        String city5 = "3,Tokyo";
        List<String> cities =  Arrays.asList(city1,city2,city3,city4,city5);
        when(cityRepository.getBottomFive()).thenReturn(cities);
        List<String> citiesResult = cityController.getBottomFive();


        assertArrayEquals(citiesResult.toArray(),cities.toArray());

    }
}
