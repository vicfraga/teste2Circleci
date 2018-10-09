import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void teste() {

        Calculadora calc = new Calculadora();
        int resultado = calc.soma(6, 4);

        assertEquals(10, resultado);

    }
    @Test
    public void testeSub(){

        Calculadora calcSub = new Calculadora();
        int resultado2 = calcSub.subtracao(50, 25);
        assertEquals(25, resultado2);
    }
}
