package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestCrear {

    public TestCrear() {
    }

    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado = new Empleado("180019991", "Empleado", 20, 2);
        BussEmpleado instancia = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instancia.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
