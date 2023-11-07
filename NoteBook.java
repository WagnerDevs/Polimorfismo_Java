public class NoteBook extends Computador {

    private int polegadasTela;

    public int GetPolegadasTela() {
        return polegadasTela;
    }

    public void SetPolegadasTela(int valor) {
        polegadasTela = valor;
    }

    public double CalculaValor() {
        return GetGbMemoria() * 250 + GetNumProcessadores() * 500 + polegadasTela * 100;
    }

    public void Imprimir() {

        System.out.println("Tamanho da tela: " + polegadasTela + " polegadas");

        System.out.println("Memória: " + GetGbMemoria() + "Gb");

        System.out.println("Processadores: " + GetNumProcessadores());
    }
}