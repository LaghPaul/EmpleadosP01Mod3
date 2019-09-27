package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestBuscar {

    public TestBuscar() {
    }

    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        BussEmpleado instancia = new BussEmpleado();
        String esperado = "11111111";
        String obtenido = instancia.Buscar(esperado).getRut();
        Assert.assertEquals(esperado, obtenido);
    }
}
