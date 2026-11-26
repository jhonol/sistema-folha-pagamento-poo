public class ControleDeFolha {
    private double totalGastofolha = 0.0;

    public void registrar(Employee e) {
        totalGastofolha += e.calcularRemuneracaoTotal();
        e.imprimirHolerite();
    }

    public double getTotalGastoFolha() {
        return totalGastofolha;
    }
}
