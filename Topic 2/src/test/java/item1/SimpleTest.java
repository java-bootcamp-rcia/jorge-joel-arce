package item1;

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







}
