public class Manager extends Employee{
    private double verbaGestao;

    public Manager(String name, String cpf, double baseSalary, double verbaGestao) {
        super(name, cpf, baseSalary);
        this.verbaGestao = 1500.0;
    }

    @Override
    public double calcularRemuneracaoTotal() {
        double bonus = baseSalary * 0.15;
        return baseSalary + verbaGestao + bonus;
    }

    public double getVerbaGestao() {
        return verbaGestao;
    }
}
