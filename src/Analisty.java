public class Analisty extends Employee {

    public Analisty(String name, String cpf, double baseSalary) {
        super(name, cpf, baseSalary);
    }

    @Override
    public double calcularRemuneracaoTotal() {
        return baseSalary+500.0;
    }
}
