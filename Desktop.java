public class Desktop extends Computador {

    private double acessorios;

    public double GetAcessorios() {
        return acessorios;
    }

    public void SetAcessorios(double valor) {
        acessorios = valor;
    }

    public double CalculaValor() {
        return GetGbMemoria() * 200 + GetNumProcessadores() * 400 + acessorios;
    }

    public void Imprimir() {

        System.out.println("Acessorios: " + acessorios);

        System.out.println("Memória: " + GetGbMemoria() + "Gb");

        System.out.println("Processadores: " + GetNumProcessadores());
    }
}
