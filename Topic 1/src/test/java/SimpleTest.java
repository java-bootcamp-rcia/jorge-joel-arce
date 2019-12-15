import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleTest {

    private ListaArchivos miLista;

    @BeforeEach
    public void beforeEachTest(){
        miLista = new ListaArchivos();
    }

    @Test
    public void whenProgramRunsTheListIsEmpty(){

        List otraLista = new ArrayList();
        boolean expectedResult = otraLista.isEmpty();
        boolean actualResult = miLista.getMiLista().isEmpty();

        assertEquals(expectedResult,actualResult);


    }

    @Test
    public void whenAFileIsOpenedItIsAddedAtTheListAtTheBegginingOfTheList(){
        String archivo1 = "archivo 1";
        String archivo2= "archivo numero 2";
        miLista.abrirArchivo(archivo1);
        miLista.abrirArchivo(archivo2);
        assertEquals(archivo2, miLista.getMiLista().get(0));
    }

    @Test
    public void whenTheListReachesTheMaximumSizeThisRemainsTheSame(){
        int expectedResult = 5;
        miLista.setMiLista(new ArrayList<String>(Arrays.asList("asd","qwerty","1234","5555","da")));
        miLista.abrirArchivo("aaaa");

        int actualResult = miLista.getMiLista().size();

        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void whenAFileExistsInTheListThisIsMovedToTheBegginingAndDeleteTheDuplicate(){
        miLista.setMiLista(new ArrayList<String>(Arrays.asList("asd","qwerty","1234","5555","da")));

        String archivo1 = "qwerty";
        String archivoDuplicado = miLista.duplicado(archivo1);

        assertEquals(archivo1,archivoDuplicado);
    }




    /*@Test
    public void whenOpenedAnExistingFileThisIsBumpedToTheTop(){
        String expectedResult = "qwerty";
        //String actualResult = miLista.abrirArchivo(expectedResult);
        assertEquals(expectedResult,actualResult);

    }*/

    /*public void whenOpendeAnExistingFileThisDoesNotDuplicate(){
        String expectedResult = "123";
        String actualResult =
    }*/


    /*@Test
    public void featureTest(){
        String equation = "3+4*5-6";
        double expectedResult = 17;
        Calculator  calculator = new Calculator();
        double actualResult = calculator.calculate(equation);
        assertEquals(expectedResult, actualResult, delta);
    }*/



    /*@Test
    public void whenIHaveAStringOfOneThenIGetADoubleOne(){
        String equation = "1";
        double expectedResult = 1.0;
        double actualResult = calculator.calculate(equation);

        assertEquals(expectedResult,actualResult, DELTA);
    }

    @Test
    public void whenIHaveAStringOfTwoThenIgetADoubleTwo(){
        String equation = "2";
        double expectedResult = 2.0;
        double actualResult = calculator.calculate(equation);

        assertEquals(expectedResult,actualResult, DELTA);

    }

    @Test
    public void whenIHaveAStringOfOnePlusOneThenIGetADoubleTwo(){
        String equation = "1+1";
        double expectedResult = 2.0;
        double actualResult = calculator.calculate(equation);

        assertEquals(expectedResult,actualResult,DELTA);
    }*/


}
