package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List <Numeros> numeros;

    public OrdenacaoNumeros (){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(new Numeros(numero));
    }

    public List<Numeros> ordenarAscendente(){
        List<Numeros> numerosOrdenadosAsc = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenadosAsc);
        return numerosOrdenadosAsc;
    }

    public List<Numeros> ordenarDescendente(){
        List<Numeros> numerosOrdenadosDesc = new ArrayList<>(ordenarAscendente());
        Collections.reverse(numerosOrdenadosDesc);
        return numerosOrdenadosDesc;
    }

}
