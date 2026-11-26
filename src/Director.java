public class Director extends Employee {

    private double participacaoLucros;

    public Director(String name, String cpf, double baseSalary, double participacaoLucros) {
        super(name, cpf, baseSalary);
        this.participacaoLucros = participacaoLucros;
    }

    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    @Override
    public double calcularRemuneracaoTotal() {
        return baseSalary + participacaoLucros;
    }
}
