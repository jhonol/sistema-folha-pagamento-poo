public class Main {
    public static void main(String[] args) {

        var controle = new ControleDeFolha();
        var a1 = new Analisty("Luís","256789141",2200.0);
        var g1 = new Manager("Carlos","2334887561",4000.0,1500.0);
        var d1 = new Director("Gustavo","566899741",5800.0,1000.0);

        controle.registrar(a1);
        controle.registrar(g1);
        controle.registrar(d1);

        System.out.println(controle.getTotalGastoFolha());
    }
}
