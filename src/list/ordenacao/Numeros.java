package list.ordenacao;

public class Numeros implements Comparable<Numeros>{

    private int nuns;

    public Numeros(int numero){
        this.nuns = numero;
    }

    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(nuns, n.getNuns());
    }

    public int getNuns() {
        return nuns;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "nuns=" + nuns +
                '}';
    }
}
