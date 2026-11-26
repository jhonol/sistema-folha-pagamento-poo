public class Employee {
    protected String name;
    protected String cpf;
    protected double baseSalary;

    public Employee(String name, String cpf, double baseSalary) {
        this.name = name;
        this.cpf = cpf;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calcularRemuneracaoTotal() {
        return baseSalary;
    }

    public void imprimirHolerite() {
        System.out.println("[Cargo] Nome: "+name+" | Salário Base: R$ "+baseSalary+" | Total a receber: R$ "+calcularRemuneracaoTotal());
    }
}
