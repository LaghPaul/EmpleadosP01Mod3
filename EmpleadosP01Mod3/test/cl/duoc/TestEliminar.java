package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {

    public TestEliminar() {
    }

    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        BussEmpleado instancia = new BussEmpleado();
        String rut = "11111111";
        boolean esperado = true;
        boolean obtenido = instancia.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
    }
}
