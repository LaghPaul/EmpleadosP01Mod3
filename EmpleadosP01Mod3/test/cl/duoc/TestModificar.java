package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {
    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        BussEmpleado instancia = new BussEmpleado();        
        Empleado empleado = new Empleado("22222222", "Jimena", 25, 5);
        boolean esperado = true;
        boolean obtenido = instancia.Modificar(empleado);
        Assert.assertEquals(esperado, obtenido);        
    }
}
