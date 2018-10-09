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

@Test
public void testeDiv(){
    Calculadora calcDiv = new Calculadora();
        float resultado3 = calcDiv.divisao(99, 3);
            assertEquals(33, resultado3);
}

@Test
public void testeMult(){
    Calculadora calcMult = new Calculadora();
    int resultado4 = calcMult.multiplica(5,9);
        assertEquals(45, resultado4);
}
}