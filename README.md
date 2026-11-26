# Sistema de Controle de Folha de Pagamento (POO em Java)

Projeto desenvolvido em **Java** com foco na aplicação prática dos pilares da **Programação Orientada a Objetos (POO)**, como **Herança**, **Polimorfismo** e **Encapsulamento**, para calcular remunerações de diferentes cargos e consolidar o gasto total da folha.

---

## Estrutura do Projeto

O sistema é composto pelas seguintes classes:

* **`Employee` (Classe Base):** Define os atributos comuns (`name`, `cpf`, `baseSalary`), o método base `calcularRemuneracaoTotal()` e o método `imprimirHolerite()` para exibir os dados e o total a receber.
* **`Analisty` (Subclasse):** Estende `Employee` e sobrescreve `calcularRemuneracaoTotal()` adicionando um acréscimo fixo de `500.0` ao salário base.
* **`Manager` (Subclasse):** Estende `Employee`, possui o atributo `verbaGestao` e sobrescreve `calcularRemuneracaoTotal()` somando salário base, verba de gestão e um bônus de `15%` sobre o salário base (`baseSalary * 0.15`).
* **`Director` (Subclasse):** Estende `Employee`, possui o atributo `participacaoLucros` e sobrescreve `calcularRemuneracaoTotal()` somando o salário base à participação nos lucros.
* **`ControleDeFolha`:** Centraliza o registro de colaboradores (`registrar(Employee e)`), acumula o gasto total (`totalGastofolhafolha` / `getTotalGastoFolha()`) e dispara a impressão dos holerites.
* **`Main`:** Classe de execução que instancia exemplos de `Analisty` (Luís), `Manager` (Carlos) e `Director` (Gustavo), registra-os no controle de folha e exibe o gasto total acumulado.

---

## Regras de Cálculo de Remuneração

| Cargo / Classe | Regra de `calcularRemuneracaoTotal()` |
| :--- | :--- |
| **`Employee`** | `baseSalary` |
| **`Analisty`** | `baseSalary + 500.0` |
| **`Manager`** | `baseSalary + verbaGestao + (baseSalary * 0.15)` |
| **`Director`** | `baseSalary + participacaoLucros` |

---

## Conceitos Aplicados

* **Herança:** Reutilização de atributos e comportamentos comuns a partir de `Employee` por meio de `extends` e chamadas ao construtor `super(...)`.
* **Polimorfismo:** O método `ControleDeFolha.registrar(Employee e)` recebe referências do tipo `Employee` e executa dinamicamente a implementação específica de `calcularRemuneracaoTotal()` de cada subclasse em tempo de execução.
* **Encapsulamento:** Uso de modificadores de acesso (`protected` e `private`) e métodos de acesso (`getters`) para proteger o estado dos objetos.

---

## Como Executar

1. Certifica-te de ter o **JDK** instalado na tua máquina.
2. Compila os arquivos `.java` no terminal ou executa diretamente pela tua IDE (como IntelliJ IDEA, VS Code ou NetBeans):

```bash
javac *.java
java Main
