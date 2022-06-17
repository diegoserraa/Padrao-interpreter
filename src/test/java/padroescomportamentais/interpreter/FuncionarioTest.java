package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario1(2.000);
        funcionario.setSalario2(1.000);

        assertEquals(3.000, funcionario.calcularSalario());
    }

}