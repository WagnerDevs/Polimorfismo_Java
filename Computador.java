public abstract class Computador implements Imprimivel {

    private int gbMemoria;

    private int numProcessadores;

    public int GetGbMemoria() {
        return gbMemoria;
    }

    public void SetGbMemoria(int valor) {
        gbMemoria = valor;
    }

    public int GetNumProcessadores() {
        return numProcessadores;
    }

    public void SetNumProcessadores(int valor) {
        numProcessadores = valor;
    }

    public abstract double CalculaValor();
}