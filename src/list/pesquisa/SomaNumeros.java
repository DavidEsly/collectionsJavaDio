package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for(Integer s : numeros){
            soma += s;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for(int i = 0; i < numeros.size(); i++){
            if(i == 0){
                maior = numeros.get(i);
            }else if(numeros.get(i) >= maior){
                maior = numeros.get(i);
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 0;
        for(int i = 0; i < numeros.size(); i++){
            if(i == 0){
                menor = numeros.get(i);
            }else if(numeros.get(i) <= menor){
                menor = numeros.get(i);
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(numeros.toString());
    }

    public static void main(String[] args) {
        SomaNumeros s = new SomaNumeros();
        s.adicionarNumero(1);
        s.adicionarNumero(4);
        s.adicionarNumero(6);
        s.adicionarNumero(8);
        s.adicionarNumero(20);
        s.adicionarNumero(10);
        s.adicionarNumero(11);

        System.out.println(s.calcularSoma());
        System.out.println(s.encontrarMaiorNumero());
        System.out.println(s.encontrarMenorNumero());
        s.exibirNumeros();

    }
}
