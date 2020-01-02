package item1;

import item1.ListaArchivos;

public class Main {

    public static void main(String[] args) {
        ListaArchivos milista = new ListaArchivos();
        //milista.setMiLista(new ArrayList<String>(Arrays.asList("asd","qwerty","1234","5555","da")));
        //System.out.println(milista.getMiLista());
        milista.abrirArchivo("ndeah");
        System.out.println(milista.getMiLista());
        milista.abrirArchivo("1234");
        System.out.println(milista.getMiLista());
        milista.abrirArchivo("qwerty");
        System.out.println(milista.getMiLista());
        milista.abrirArchivo("1234");
        System.out.println(milista.getMiLista());
    }
}
