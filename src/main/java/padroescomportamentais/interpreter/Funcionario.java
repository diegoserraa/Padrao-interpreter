package padroescomportamentais.interpreter;

public class Funcionario {
    private double salario1;
    private double salario2;

    public double getNota1() {
        return salario1;
    }

    public void setSalario1(double salario1) {
        this.salario1 = salario1;
    }

    public double getNota2() {
        return salario2;
    }

    public void setSalario2(double salario2) {
        this.salario2 = salario2;
    }

    public double calcularSalario() {
        return Empresa.calcularSalario(this.salario1, this.salario2);
    }
}
