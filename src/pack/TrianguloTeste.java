package pack;

import static org.junit.Assert.*;
import org.junit.Test;

public class TrianguloTeste {

    Triangulo t = new Triangulo();

    @Test
    public void testarTriangulo(){
        // válidos
        assertTrue(t.podeSerTriangulo(4,5,6));
        assertTrue(t.podeSerTriangulo(10,12,14));
        assertTrue(t.podeSerTriangulo(2,3,4));
        assertTrue(t.podeSerTriangulo(100,120,150));

        // inválidos
        assertFalse(t.podeSerTriangulo(1,2,3));
        assertFalse(t.podeSerTriangulo(0,0,0));
        assertFalse(t.podeSerTriangulo(1,100,90));
        assertFalse(t.podeSerTriangulo(10,10,-10));
    }

    @Test
    public void testarEquilatero(){
        // válidos
        assertTrue(t.eEquilatero(4,4,4));
        assertTrue(t.eEquilatero(1,1,1));
        assertTrue(t.eEquilatero(5,5,5));
        assertTrue(t.eEquilatero(100,100,100));

        // inválidos
        assertFalse(t.eEquilatero(4,5,6));
        assertFalse(t.eEquilatero(6,7,8));
        assertFalse(t.eEquilatero(100,120,140));
        assertFalse(t.eEquilatero(90,100,120));
    }

    @Test
    public void testarIsosceles(){
        // válidos
        assertTrue(t.eIsosceles(4,4,6));
        assertTrue(t.eIsosceles(2,2,3));
        assertTrue(t.eIsosceles(10,15,10));
        assertTrue(t.eIsosceles(1200,1000,1000));

        // inválidos
        assertFalse(t.eIsosceles(4,5,6));
        assertFalse(t.eIsosceles(90,91,92));
        assertFalse(t.eIsosceles(100,110,120));
        assertFalse(t.eIsosceles(500,502,503));
    }

    @Test
    public void testarEscaleno(){
        // válidos
        assertTrue(t.eEscaleno(4,5,6));
        assertTrue(t.eEscaleno(50,51,52));
        assertTrue(t.eEscaleno(100,110,120));
        assertTrue(t.eEscaleno(23,26,34));

        // inválidos
        assertFalse(t.eEscaleno(1,1,1));
        assertFalse(t.eEscaleno(2,2,2));
        assertFalse(t.eEscaleno(3,3,3));
        assertFalse(t.eEscaleno(4,4,4));
    }
}