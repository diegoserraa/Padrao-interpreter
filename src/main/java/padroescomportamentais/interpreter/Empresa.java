package padroescomportamentais.interpreter;

public class Empresa {

    public static String formula = "nota1 + nota2";

    public static double calcularSalario(double salario1, double salario2) {
        String expressao;
        expressao = formula.replace("nota1", Double.toString(salario1));
        expressao = expressao.replace("nota2", Double.toString(salario2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
