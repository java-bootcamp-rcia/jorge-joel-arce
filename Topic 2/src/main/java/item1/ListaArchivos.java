package item1;

import java.util.*;

public class ListaArchivos {

    private List<String> miLista;

    public ListaArchivos(){
        this.miLista = new ArrayList<>();
    }


    public void abrirArchivo(String archivo) {
        String duplicado = duplicado(archivo);
        if(duplicado!=null) {
            miLista.remove(duplicado(archivo));
        }
        miLista.add(0,archivo);
        if(miLista.size()>5){
            miLista.remove(5);
        }

    }

    public String duplicado(String archivo) {
        String duplicado=null;
        Iterator<String>iterator = miLista.iterator();
        while (iterator.hasNext()){
            duplicado = iterator.next();
            if(archivo.equals(duplicado)){
                break;
            }else{
                duplicado=null;
            }
        }
        return duplicado;
    }


    public void setMiLista(List<String> miLista) {
        this.miLista = miLista;
    }

    public List<String> getMiLista() {
        return miLista;
    }


}
